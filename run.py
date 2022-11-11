#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv, re, datetime
import time
import json
from os import listdir
from os.path import isfile, join


def checkout_project(file,project,bugtype):
    root, patch = os.path.split(file)
    patchInfo = json.load(open(root+'/INFO/'+patch+'.json'))
    projectId=patchInfo['project']
    bugId=patchInfo['bug_id']
    lcProjectId=projectId.decode('utf-8').lower()
    if not os.path.exists(project):
        os.system('mkdir '+project)
        os.system('mkdir '+project+'/lib')
        os.system('cp -r ./lib  '+project)
    if not os.path.exists(project+'/'+projectId):
        os.system('mkdir '+project+'/'+projectId)
    os.system( d4jpath+'/defects4j checkout -p '+projectId+' -v '+bugId+bugtype+' -w ./'+project+'/'+projectId+'/'+projectId+bugId+'b_'+patchInfo['ID'])


def remove_project(project):
    if  os.path.exists(project):
        os.system('rm -rf '+project)


def autotest(patchName,dataset='',testSuite='2019_Evosuite',isflakyCheck="false",removeindicator='',project='tmp_projects'):
    print(patchName)
    libpath=currentpath+'/lib/evosuite-standalone-runtime-1.0.5.jar:'+currentpath+'/lib/junit-4.12.jar:'+currentpath+'/lib/hamcrest-core-1.3.jar'
    patchName=patchName.replace('|','').replace('\n','')
    root, patch = os.path.split(patchName)
    patchInfo = json.load(open(root+'/INFO/'+patch+'.json'))
    patchNo=patchInfo['ID']
    projectId=patchInfo['project']
    bugId=patchInfo['bug_id']
    toolId=patchInfo['tool']
    lcProjectId=projectId.decode('utf-8').lower()

    # checkout the original buggy programs to tmp_projects
    if isflakyCheck=="true":
        checkout_project(patchName,project,'f')
        if removeindicator=='':
            reportname="flaky_check_"+date+'.csv'
        else:
            reportname="flaky_check_"+date+removeindicator+'.csv'
    elif isflakyCheck=="false":
        checkout_project(patchName,project,'b')
        reportname=patchNo+"_"+projectId+"-"+bugId+"_"+date+'.csv'
        # apply patches to buggy programs
        applyresult=apply_patch(patchName,'',toolId,projectId,bugId,lcProjectId,project,True)
   
    # derermine the target patch of the tests
    program_path=project+'/'+projectId+'/'+projectId+bugId+'b_'+patchNo
    if projectId=='Lang':
        target_test_path=program_path+'/src/test/java'
        if not os.path.isdir(target_test_path):
                target_test_path=program_path+'/src/test'
    if projectId=='Math':
        target_test_path=program_path+'/src/test/java'
        if not os.path.isdir(target_test_path):
                target_test_path=program_path+'/src/test'
    if projectId=='Chart':
        target_test_path=program_path+'/tests'
    if projectId=='Time':
        target_test_path=program_path+'/src/test/java'
    if projectId=='Closure':
        target_test_path=program_path+'/test'
    
    if 'Evosuite' in testSuite:
        if testSuite=='ASE15_Evosuite':
            testpath='./RGT/ASE15/evosuite/'+projectId+'/'+bugId+'/'+projectId+'/evosuite-branch/'
            testseed=10
        if testSuite=='EMSE18_Evosuite':
            testpath='./RGT/EMSE18/'+projectId+'/'+projectId+bugId+'/'
            testseed=30
        if testSuite=='2019_Evosuite':
            # testpath='./RGT/2019/evosuite/'+projectId+'/'+bugId+'/'
            testpath='./testcases_fix_all/'+projectId+'/'+bugId+'/'
            testseed=30
    
        for i in range (0,testseed):
            print('Testseed '+str(i)+'/'+str(testseed-1)+':')
            seedpath=testpath+str(i)
            # copy test file
            if os.path.isdir(seedpath):
                # os.system('cp -r '+seedpath+'/.  '+target_test_path)
                # compile the tests
                os.chdir(program_path)
                os.system(d4jpath+'/defects4j compile')
                os.chdir('../../../')  
                os.system('cp -r '+seedpath+'/.  '+target_test_path)
                compath=commonTestPath(seedpath)
                comfolder=compath.rsplit('/',1)[0]
                evotestpath = target_test_path.split(program_path)[1][1:]+compath
                evotestpath=evotestpath.replace('ESTest','ESTest*')
                os.chdir(program_path)
                compileTest=''
                if os.path.exists("./target/classes"):
                    compileTest = 'javac -cp '+libpath+':./target/classes '
                    if os.path.exists("./target/test-classes"):
                        compileTest = 'javac -cp '+libpath+':./target/classes:./target/test-classes '
                    elif os.path.exists("./target/tests"):
                        compileTest = 'javac -cp '+libpath+':./target/classes:./target/tests '
                if os.path.exists("./build/classes"):
                    compileTest = 'javac -cp '+libpath+':./build/classes '
                    if os.path.exists("./build/tests"):
                        compileTest = 'javac -cp '+libpath+':./build/classes:./build/tests '
                    if os.path.exists("./build/test"):
                        compileTest = 'javac -cp '+libpath+':./build/classes:./build/test '
                        if os.path.exists("./build/lib/classes"):
                            compileTest = 'javac -cp '+libpath+':./build/classes:./build/test:./build/lib/classes '
                            if os.path.exists("./build/classess/rhino_ast"):
                                compileTest = 'javac -cp '+libpath+':./build/classes:./build/test:./build/lib/classes:./build/classes/rhino_ast/java '
                            if os.path.exists("./build/lib/rhino.jar"):
                                compileTest = compileTest[:-1]+':./build/lib/rhino.jar '                           
                
                if os.path.exists("./build/"):
                    if compileTest=='':
                        compileTest = 'javac -cp '+libpath+':./build '
                    else:
                        compileTest = compileTest[:-1]+':./build '
                if os.path.exists("./build-tests"):
                    compileTest = 'javac -cp '+libpath+':./build:./build-tests '
                if os.path.exists("./lib/libtrunk_rhino_parser_jarjared.jar"):
                    compileTest = compileTest[:-1]+':./lib/libtrunk_rhino_parser_jarjared.jar '
                if os.path.exists("./lib/guava.jar"):
                    compileTest = compileTest[:-1]+':./lib/guava.jar:./lib/protobuf-java.jar '
                if os.path.exists("./lib/guava-r06.jar"):
                    compileTest = compileTest[:-1]+':./lib/guava-r06.jar:./lib/protobuf-java-2.3.0.jar:./lib/libtrunk_rhino_parser_jarjared.jar '
                if os.path.exists("./lib/itext.jar"):
                    compileTest = compileTest[:-1]+':./lib/itext.jar '
                

                compileTestscript=compileTest+evotestpath
                print(compileTestscript)
                os.system('timeout 300 '+compileTestscript)
                ###### Move the build classes to target
                #MATH: target/test-classes
                evotestclass=evotestpath.replace(".java",".class")
                evotargetclass=comfolder
                print(comfolder)
                if os.path.exists("./target/test-classes"):
                    os.system('cp -rf '+evotestclass+' ./target/test-classes'+evotargetclass)
                    # shutil.copy(evotestclass,"./target/test-classes"+evotargetclass)
                if os.path.exists("./target/tests"):
                    os.system('cp -rf '+evotestclass+' ./target/tests'+evotargetclass)
                    # shutil.copy(evotestclass,"./target/tests"+evotargetclass)
                if os.path.exists("./build-tests"):
                    os.system('cp -rf '+evotestclass+' ./build-tests'+evotargetclass)
                    # shutil.copy(evotestclass,"./build-tests"+evotargetclass)
                if os.path.exists("./build/test"):
                    print('$$$$$$$$cp -rf '+evotestclass+' ./build/test'+evotargetclass)
                    os.system('cp -rf '+evotestclass+' ./build/test'+evotargetclass)
                    # shutil.copy(evotestpath.replace(".java",".class"),"./build/test"+compath.replace(".java",".class"))
                if os.path.exists("./build/tests"):
                    os.system('cp -rf '+evotestclass+' ./build/tests'+evotargetclass)
                    # shutil.copy(evotestclass,"./build/tests"+evotargetclass)

                #####run the specfic target test case
                clazzpath = compath[1:].replace('.java','').replace('/','.')
                print(clazzpath)
                executeTest=compileTest.replace("javac","java")+" org.junit.runner.JUnitCore "+clazzpath
                print(executeTest)
                
                result=os.popen('timeout 300 '+executeTest).read()
                # result=os.popen(d4jpath+'/defects4j test').read()
                print(result)              
                os.chdir('../../../')  

                result_path = out_dir+testSuite+'/'

                if not os.path.exists(result_path):
                    os.makedirs(result_path)
                with open(result_path+reportname, 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    resultlines=result.split('\n')
                    patchName=patchName.replace('|','').replace('\n','')
                    time=''
                    okpattern='OK (* tests)'
                    failpattern='Tests run: *,  Failures: *'         
                    failInfoPattern='*test*(*)'           
                    failingInfo=''
                    failingTestsNo=0
                    testrun=''
                    assertionfailpattern='*org.junit.ComparisonFailure:*expected*but was*'
                    assertfailinfo=''
                    exceptionpattern='*java.lang.AssertionError: Expecting exception*'
                    exceptioninfo=''
                    otherreason=''
                    for k in range(0,len(resultlines)):
                        line=resultlines[k]
                        if 'Time:' in line:
                            time=line.split('Time: ')[1]
                        if fnmatch.fnmatch(line, okpattern):
                            failingTestsNo=0
                            testrun=line.split('(')[1].split(' ')[0]
                        if fnmatch.fnmatch(line, failpattern):
                            failingTestsNo=line.split("Failures:")[1]
                            testrun=line.split(",")[0].split("Tests run: ")[1]
                        if fnmatch.fnmatch(line, failInfoPattern):
                            failingInfo=failingInfo+line
                            otherreason+=resultlines[k+1]
                        if fnmatch.fnmatch(line, assertionfailpattern):
                            assertfailinfo+=line+'^'
                        if fnmatch.fnmatch(line, exceptionpattern):
                            exceptioninfo+=line+'^'                        
 
                    filewriter.writerow([patchName,projectId, bugId, testSuite, i, testrun, failingTestsNo, time, failingInfo, assertfailinfo,exceptioninfo,otherreason])      
            else:
                print('No tests for '+patchName+' in test suite '+testSuite)
        remove_project(project)  
  


    if 'Randoop' in testSuite:
        if testSuite=='ASE15_Randoop':
            randoop_path='./RGT/ASE15/randoop/'
            testseed=11
        elif testSuite=='2019_Randoop':
            randoop_path='./RGT/2019/randoop/'
            testseed=31
        
        #copy randoop tests       
        os.chdir(program_path)
        os.system(d4jpath+'/defects4j compile')
        os.chdir('../../../') 
        for i in range(1,testseed):
            print('Testseed '+str(i)+'/'+str(testseed-1)+':')
            #extract the bz2 file first
            print('tar -jxvf '+randoop_path+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2')
            if testSuite=='ASE15_Randoop':
                os.system('tar -jxvf '+randoop_path+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2')
            if testSuite=='2019_Randoop':
                if projectId=='Time':
                    os.system('tar -jxvf '+randoop_path+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2')
                else:
                    print("mkdir"+ '   ./'+projectId+'-'+bugId+'f-randoop.'+str(i))
                    os.system('mkdir '+projectId+'-'+bugId+'f-randoop.'+str(i))
                    os.system('tar -jxvf '+randoop_path+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2  -C ./'+projectId+'-'+bugId+'f-randoop.'+str(i))
            original_test_path='./'+projectId+'-'+bugId+'f-randoop.'+str(i)
            
            if os.path.exists(original_test_path):
                print('original_test_path:'+original_test_path)   
                listdirs = os.listdir(original_test_path)
                for f in listdirs:
                    if os.path.isfile(os.path.join(original_test_path, f)):
                        os.system('cp -r '+original_test_path+'/.  '+target_test_path)
                    else:
                        os.system('cp -r '+original_test_path+'/'+f+'/.  '+target_test_path)
                #delete extracted file
                os.system('rm -r '+projectId+'-'+bugId+'f-randoop.'+str(i))
                #check the build targer
                os.chdir(program_path)    
                compileTest=''           
                
                if os.path.exists("./target/classes"):
                    compileTest = 'javac -cp '+libpath+':./target/classes '
                    if os.path.exists("./target/test-classes"):
                        compileTest = 'javac -cp '+libpath+':./target/classes:./target/test-classes '
                    elif os.path.exists("./target/tests"):
                        compileTest = 'javac -cp '+libpath+':./target/classes:./target/tests '
                if os.path.exists("./build/classes"):
                    compileTest = 'javac -cp '+libpath+':./build/classes '
                    if os.path.exists("./build/tests"):
                        compileTest = 'javac -cp '+libpath+':./build/classes:./build/tests '
                    if os.path.exists("./build/test"):
                        compileTest = 'javac -cp '+libpath+':./build/classes:./build/test '
                        if os.path.exists("./build/lib/classes"):
                            compileTest = 'javac -cp '+libpath+':./build/classes:./build/test:./build/lib/classes '
                            if os.path.exists("./build/classess/rhino_ast"):
                                compileTest = 'javac -cp '+libpath+':./build/classes:./build/test:./build/lib/classes:./build/classes/rhino_ast/java '
                            if os.path.exists("./build/lib/rhino.jar"):
                                compileTest = compileTest[:-1]+':./build/lib/rhino.jar '                           
                
                if os.path.exists("./build/"):
                    if compileTest=='':
                        compileTest = 'javac -cp '+libpath+':./build '
                    else:
                        compileTest = compileTest[:-1]+':./build '
                if os.path.exists("./build-tests"):
                    compileTest = 'javac -cp '+libpath+':./build:./build-tests '
                if os.path.exists("./lib/libtrunk_rhino_parser_jarjared.jar"):
                    compileTest = compileTest[:-1]+':./lib/libtrunk_rhino_parser_jarjared.jar '
                if os.path.exists("./lib/guava.jar"):
                    compileTest = compileTest[:-1]+':./lib/guava.jar:./lib/protobuf-java.jar '
                if os.path.exists("./lib/guava-r06.jar"):
                    compileTest = compileTest[:-1]+':./lib/guava-r06.jar:./lib/protobuf-java-2.3.0.jar:./lib/libtrunk_rhino_parser_jarjared.jar '
                if os.path.exists("./lib/itext.jar"):
                    compileTest = compileTest[:-1]+':./lib/itext.jar '

                #compile
                if testSuite=='ASE15_Randoop':
                    randoopSrcFiles=target_test_path.split(program_path)[1][1:]+"/RandoopTest*.java"
                if testSuite=='2019_Randoop':
                    randoopSrcFiles=target_test_path.split(program_path)[1][1:]+"/RegressionTest*.java"
                print('randoopSrcFiles'+randoopSrcFiles)
                compilescript=compileTest+randoopSrcFiles

                
                print(compilescript)
                os.system('timeout  300 '+compilescript)
                target_class_path=''
                #move compile to test target
                if os.path.exists("./target/test-classes"):
                    target_class_path="./target/test-classes"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./target/test-classes/")
                if os.path.exists("./target/tests"):
                    target_class_path="./target/tests"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./target/tests/")
                if os.path.exists("./build-tests"):
                    target_class_path="./build-tests"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./build-tests/")
                if os.path.exists("./build/test"):
                    target_class_path="./build/test"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./build/test/")
                if os.path.exists("./build/tests"):
                    target_class_path="./build/tests"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./build/tests/")

                #execute test cases
                target_class_files=''
                listdirs = os.listdir(target_class_path)
                for f in listdirs:
                    if testSuite=='ASE15_Randoop':
                        pattern = 'RandoopTest*.class'
                    elif testSuite=='2019_Randoop':
                        pattern = 'RegressionTest*.class'
                    if os.path.isfile(os.path.join(target_class_path, f)):
                        if fnmatch.fnmatch(f, pattern):
                            target_class_files=target_class_files+f.split(".")[0]+' '
                       
                executeTest=compileTest.replace("javac","java")+" org.junit.runner.JUnitCore "+target_class_files
                print(executeTest)
                result=""           
                result=os.popen('timeout 300 '+executeTest).read()
                print(result)

                #remove the classes files
                if os.path.exists(target_class_path):
                    if testSuite=='ASE15_Randoop':
                        os.system('rm -rf '+target_class_path+'/Randoop*')
                    elif testSuite=='2019_Randoop':
                        os.system('rm -rf '+target_class_path+'/Regression*')


                os.chdir('../../../')
                result_path = out_dir+testSuite+'/'

                if not os.path.exists(result_path):
                    os.makedirs(result_path)
                with open(result_path+reportname, 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    resultlines=result.split('\n')
                    time=''
                    okpattern='OK (* tests)'
                    failpattern='Tests run: *,  Failures: *'         
                    failInfoPattern='*test*(*)'           
                    failingInfo=''
                    failingTestsNo=0
                    testrun=''
                    NoTestFoundCount=0
                    warningpatern='*warning*'
                    reason=''

                    for k in range(0,len(resultlines)):
                        line=resultlines[k]
                        if 'Time:' in line:
                            time=line.split('Time: ')[1]
                        if fnmatch.fnmatch(line, okpattern):
                            failingTestsNo='0'
                            testrun=line.split('(')[1].split(' ')[0]
                        if fnmatch.fnmatch(line, failpattern):
                            failingTestsNo=line.split("Failures:")[1]
                            testrun=line.split(",")[0].split("Tests run: ")[1]
                        if fnmatch.fnmatch(line, failInfoPattern):
                            line=line.split('at')[0].replace(' ','')
                            failingInfo+=line+'^'
                            reason+=resultlines[k+1]+'^'
                        if fnmatch.fnmatch(line, warningpatern):
                            NoTestFoundCount=int(NoTestFoundCount)+1
                        
                        
                    filewriter.writerow([patchName,projectId, bugId, testSuite, i, testrun, int(failingTestsNo)-int(NoTestFoundCount), time, failingInfo,reason])    
            else:
                with open('./statistics/'+reportname, 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    filewriter.writerow([patchName,projectId, bugId, testSuite, i,'0','0','0', 'No tests'])   

        remove_project(project)  
            

def commonTestPath(path):
    for root, dirs, files in os.walk(path, topdown=False):
        for name in files:
            pattern = '*Test.java'
            if fnmatch.fnmatch(name, pattern):
                return os.path.join(root, name).split(path)[1]
    return ''


def apply_patch(patchpath,dataset,toolId,projectId,bugId,lcProjectId,buggyProject,patchsim=False):
    patchNo = patchpath.split('/')[-1]
    patch_file = open(patchpath, 'r')
    lines = patch_file.readlines()

    change_patches = []
    change_patch = {
        'class_name': '',
        'start_line': 0,
        'append_lines': [],
        'append_line_count': 0,
        'remove_lines': [],
        'remove_line_count': 0
    } # Object()
    class_name = ''
    start_line = 0
    remove_line_count = 0
    append_line_count = 0
    append_lines = []
    remove_lines = []
    start_function_change = False
    for line in lines:
        if line.startswith('---'):
            class_name = line.replace('--- ', '').split()[0].replace('\n', '')
            project = class_name.find('/')
            class_name = class_name[project:]
            # class_name = class_name[0:project]

        if line.startswith('@@'):
            tmp_split = line.split(' ')
            for tmp in tmp_split:
                if tmp.startswith('-'):
                    # Remove
                    tmp_split_2 = tmp.split(',')
                    remove_line_count = int(tmp_split_2.__getitem__(1))
                    continue
                if tmp.startswith('+'):
                    # Append
                    tmp_split_2 = tmp.split(',')
                    start_line = int(tmp_split_2.__getitem__(0).replace('+', ''))
                    append_line_count = int(tmp_split_2.__getitem__(1))
                    continue
            start_function_change = True
            continue

        if start_function_change:
            if line.startswith('-'):
                remove_lines.append(line.replace('-', ' ', 1))
            elif line.startswith('+'):
                append_lines.append(line.replace('+', ' ', 1))
            else:
                remove_lines.append(line)
                append_lines.append(line)

            if len(append_lines) == append_line_count and len(remove_lines) == remove_line_count:
                change_patch['class_name'] = class_name
                change_patch['start_line'] = start_line
                change_patch['append_lines'] = append_lines
                change_patch['append_line_count'] = append_line_count
                change_patch['remove_lines'] = remove_lines
                change_patch['remove_line_count'] = remove_line_count
                change_patches.append(change_patch)

                change_patch = {
                    'class_name': '',
                    'start_line': 0,
                    'append_lines': [],
                    'append_line_count': 0,
                    'remove_lines': [],
                    'remove_line_count': 0
                } # Object()
                start_line = 0
                remove_line_count = 0
                append_line_count = 0
                line_change_count = 0
                append_lines = []
                remove_lines = []
                start_function_change = False
            continue

    if len(change_patches) > 0:
        # Apply patch to buggy program
        for change_patch in change_patches:
            class_name = change_patch['class_name']
            if class_name.__contains__(' ') or class_name.__contains__('\t') or class_name.__contains__('\n'):
                class_name = class_name.replace(' ', '').replace('\t', '').replace('\n', '')

            generate_patch_file_path = buggyProject+'/'+projectId+'/'+projectId+bugId+'b_'+patchNo+class_name

            remove_line_bypass = 0
            appending_lines = False
            file = open(generate_patch_file_path, 'r')
            lines = file.readlines()

            generate_patch_file = open(generate_patch_file_path, 'w')
            for index, line in enumerate(lines):
                if index == change_patch['start_line'] - 1:
                    appending_lines = True
                    for append_line in change_patch['append_lines']:
                        generate_patch_file.write(append_line)

                if appending_lines:
                    if remove_line_bypass < change_patch['remove_line_count']:
                        remove_line_bypass += 1
                        continue
                    else:
                        appending_lines = False

                generate_patch_file.write(line)
            generate_patch_file.close()
    else:
        return 2 # No differences between buggy and patched program
    patch_file.close()
    return 0


def validation(patchName):
    patchInfo = json.load(open(root+'/INFO/'+patchName+'.json'))
    patchId=patchInfo['ID']
    projectId=patchInfo['project']
    bugId=patchInfo['bug_id']
    toolId=patchInfo['tool']
    lcProjectId=projectId.decode('utf-8').lower()
    checkout_project(root+'/'+patchName,'tmp_projects','b')
    patchResult = apply_patch(root+'/'+patchName,'',toolId,projectId,bugId,lcProjectId,'tmp_projects',True)
    if patchResult == 0:
        program_path='./tmp_projects/'+projectId+'/'+projectId+bugId+'b_'+patchId
        os.chdir(program_path)
        compileResult = os.system(d4jpath+'/defects4j compile')
        os.chdir('../../../')
        print(compileResult)
        if compileResult == 0: 
            print("OK") 
        else:
            print("COMPILE ERROR")
            error_set.append(patchName)
            json.dump(error_set, open('train_error_patch.json', 'w'))
    else:
        print("PATCH ERROR ")
        error_set.append(patchName)
        json.dump(error_set, open('train_error_patch.json', 'w'))
    remove_project('tmp_projects')


if __name__ == '__main__':
    currentpath=os.path.dirname(os.path.realpath(__file__))
    d4jpath=currentpath+'/defects4j/framework/bin'
    command=sys.argv[1]
    now = datetime.datetime.now()
    today = now.strftime("%Y-%m-%d")
    # eval_set_missing = [14, 22, 24, 37, 38, 58, 68, 69, 73, 75, 76, 79, 91, 152, 157, 161, 163, 169, 171, 175, 177, 183, 185, 186]
    eval_set = [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 36, 37, 38, 44, 45, 46, 47, 48, 49, 51, 53, 54, 55, 58, 59, 62, 63, 64, 65, 66, 67, 68, 69, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 89, 90, 91, 92, 93, 150, 151, 152, 153, 154, 155, 157, 158, 159, 160, 161, 162, 163, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 191, 192, 193, 194, 195, 196, 197, 198, 199, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 'HDRepair1', 'HDRepair3', 'HDRepair4', 'HDRepair5', 'HDRepair6', 'HDRepair7', 'HDRepair8', 'HDRepair9', 'HDRepair10']
    eval_set = [1]
    eval_set = ['Patch'+str(i) for i in eval_set]
    total = len(eval_set)
    error_set = []
    root = '/home/hungnh/Thanh/TSE_submission/data/evaluation_raw'
    out_dir = './statistics/patchsim_APR_patches/'

    # ./run.py validation
    if command=='validation':
        print("=============== Patches validation ===============")
        i = 1
        for patchName in eval_set:
            print("["+str(i)+"/"+str(total)+"] Patching "+patchName)
            validation(patchName)
            i += 1

    # ./run.py patchsim
    elif command=='patchsim':            
        print("=============== Evaluation with Patchsim ===============")
        i = 1
        for patchName in eval_set:
            now = datetime.datetime.now()
            date = now.strftime("%Y-%m-%d-%H-%M-%S")
            print("["+str(i)+"/"+str(total)+"] Eval "+patchName)
            autotest(root+'/'+patchName, patchsim=True,project='tmp_projects')
            i += 1
        remove_project('tmp_projects')