import sys, os, argparse
from os import listdir
from os.path import isfile, join

if __name__ == '__main__':
    parser = argparse.ArgumentParser(description='Generate test cases using specified generator.')

    parser.add_argument('option', help='Generate test cases or unzip generated test files: generate/unzip')
    parser.add_argument('generator', help='Generator could be one of these: evosuite/randoop/mutation/coverage')
    parser.add_argument('project', help='Generate tests for this project id. For example: Chart, Time, Lang, Math', default='all')
    parser.add_argument('version', help='Generate tests for this version id.  For example: 21b, 21f')
    parser.add_argument('out_dir', help='Output directory for generated test cases')
    parser.add_argument('-c', '--criterion', help='Generate tests for this criterion using the default search budget (optional)', default='branch')
    parser.add_argument('-b', '--search_budget', help='Set a specific search budget (optional)', type=int, default=100)
    parser.add_argument('-a', '--assertion_timeout', help='Set a specific timeout for assertion generation (optional)', type=int, default=300)

    args = parser.parse_args()

    if not os.path.exists(args.out_dir):
        os.makedirs(args.out_dir)

    if args.option == 'generate':
        if args.generator == 'evosuite':
            tool_path = './defects4j/framework/bin/run_evosuite.pl'
            for i in range(30):
                command = '{} -p {} -v {} -n {} -o {} -c {} -b {} -a {}'.format(
                    tool_path, args.project, args.version, i, args.out_dir, args.criterion, args.search_budget, args.assertion_timeout
                ) # run_evosuite.pl -p Chart -v 21b -n 1 -o tmp_dir -c branch -b 100 -a 300
                print(command)
                os.system(command)

    else if args.option == 'unzip':
        if args.project == 'all':
            for projectId in ['Chart', 'Lang', 'Math', 'Time']:
                for i in range(30):
                    zip_root = '{}/{}/{}-{}/{}'.format(
                        args.out_dir, projectId, args.generator, args.criterion, i
                    ) # tmp_dir/Chart/evosuite-branch/1
                    zip_files = [f for f in listdir(zip_root) if isfile(join(zip_root, f))]
                    for file in zip_files:
                        file_info = file.split('-') # ['Chart', '21b', 'evosuite', 'branch.0.tar.bz2']
                        versionId = file_info[1][:-1] # 21b -> 21
                        testId = file_info[3].split('.')[1] # ['branch', '0', 'tar', 'bz2']
                        unzip_path = '{}/{}/{}/{}'.format(args.out_dir, projectId, versionId, testId)
                        if not os.path.exists(unzip_path):
                            os.makedirs(unzip_path)
                        zip_path = '{}/{}'.format(zip_root, file)
                        command = 'tar -xf {} -C {}'.format(zip_path, unzip_path)
                        print(command)
                        os.system(command)
        else:
            for i in range(30):
                zip_root = '{}/{}/{}-{}/{}'.format(
                    args.out_dir, args.project, args.generator, args.criterion, i
                ) # tmp_dir/Chart/evosuite-branch/1
                zip_files = [f for f in listdir(zip_root) if isfile(join(zip_root, f))]
                for file in zip_files:
                    file_info = file.split('-') # ['Chart', '21b', 'evosuite', 'branch.0.tar.bz2']
                    versionId = file_info[1][:-1] # 21b -> 21
                    testId = file_info[3].split('.')[1] # ['branch', '0', 'tar', 'bz2']
                    unzip_path = '{}/{}/{}/{}'.format(args.out_dir, args.project, versionId, testId)
                    if not os.path.exists(unzip_path):
                        os.makedirs(unzip_path)
                    zip_path = '{}/{}'.format(zip_root, file)
                    command = 'tar -xf {} -C {}'.format(zip_path, unzip_path)
                    print(command)
                    os.system(command)
