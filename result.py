import os
import json

def read_file(file_path):
    rs = {}
    with open(file_path, "r") as f:
        idx = 0
        for line in f:
            line_info = line.split(",")
            # line_info = [
            #     patchName, projectId, bugId, testSuite, i, 
            #     testrun, failingTestsNo, time, failingInfo, 
            #     assertfailinfo, exceptioninfo, otherreason
            # ]
            test_result = int(line_info[6])
            if int(test_result) > 0:
                rs[int(line_info[4])] = 1
            else:
                rs[int(line_info[4])] = 0
            idx += 1
    return rs


if __name__ == '__main__':
    eval_set = [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 36, 37, 38, 44, 45, 46, 47, 48, 49, 51, 53, 54, 55, 58, 59, 62, 63, 64, 65, 66, 67, 68, 69, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 89, 90, 91, 92, 93, 150, 151, 152, 153, 154, 155, 157, 158, 159, 160, 161, 162, 163, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 191, 192, 193, 194, 195, 196, 197, 198, 199, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 'HDRepair1', 'HDRepair3', 'HDRepair4', 'HDRepair5', 'HDRepair6', 'HDRepair7', 'HDRepair8', 'HDRepair9', 'HDRepair10']
    eval_set = ['Patch' + str(i) for i in eval_set]

    tp, fp, tn, fn = 0, 0, 0, 0
    tp_list, fp_list = [], []
    # missing_patches, missing_prj = [], set()
    total = 0

    data_path = '/home/hungnh/Thanh/TSE_submission/data/evaluation_raw'
    apr_rs_path = 'statistics/invalidator/2019_Evosuite_APR_patches'
    dev_rs_path = "statistics/invalidator/2019_Evosuite_dev_patches"

    apr_csv_files = [f for f in os.listdir(apr_rs_path) if os.path.isfile(os.path.join(apr_rs_path, f))]
    dev_csv_files = [f for f in os.listdir(dev_rs_path) if os.path.isfile(os.path.join(dev_rs_path, f))]

    for patchNo in eval_set:
        target = ''
        grdtruth = ''

        for file in apr_csv_files:
            if patchNo in file:
                target = file
                break

        patchInfo = json.load(open(data_path + '/INFO/' + patchNo + '.json'))
        projectId = patchInfo['project']
        bugId = patchInfo['bug_id']
        correctness=patchInfo['correctness']

        for file in dev_csv_files:
            if projectId + '-' + bugId + '_' in file:
                grdtruth = file
                break
            
        if not target:
            # missing_patches.append(int(patchNo[5:]))
            # missing_prj.add(projectId+"-"+bugId)
            continue

        apr_rs = read_file('{}/{}'.format(apr_rs_path, target))
        dev_rs = read_file('{}/{}'.format(dev_rs_path, grdtruth))
        # print("{}: {}\n------------".format(target, apr_rs))
        # print("{}: {}\n------------".format(grdtruth, dev_rs))
        
        is_incorrect = False
        for idx in range(30):
            if idx in dev_rs and idx in apr_rs:
                if dev_rs[idx] != 1 and apr_rs[idx] == 1:
                    is_incorrect = True
                    break
                
        # is_incorrect = True
        if is_incorrect:
            if correctness == "Correct":
                fp_list.append(patchNo)
                fp += 1
            else:
                tp_list.append(patchNo)
                tp += 1
        else:
            if correctness == "Correct":
                fn += 1
            else:
                tn += 1
        if correctness != "Correct":
            total += 1

    if any([tp, fp]): precision = tp/(tp+fp)
    if any([tp, fn]): recall = tp/(tp+fn)
    if any([tp, fp, tn, fn]): acc = (tp+tn)/(tp+fp+tn+fn)
    if any([precision, recall]): f1 = 2*precision*recall/(precision+recall)

    result = {
        'total': total, 'tp': tp, 'fp': fp,
        'precision': precision, 'recall': recall,
        'f1': f1, 'acc': acc,
        'tp_list': tp_list, 'fp_list': fp_list,
        # 'missing_patches': missing_patches, 'missing_prj': missing_prj
    }
    print(result)
    json.dump(result, open('result.json', 'w'))
