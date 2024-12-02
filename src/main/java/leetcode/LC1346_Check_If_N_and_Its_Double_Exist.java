package leetcode;

public class LC1346_Check_If_N_and_Its_Double_Exist {
    public boolean checkIfExist(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j] * 2 || arr[i] * 2 == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
