package leetcode;

public class LC2433_Find_The_Original_Array_of_Prefix_Xor {
    public int[] findArray(int[] pref) {
        int[] result = new int[pref.length];
        
        int prefixXor = pref[0];
        result[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            result[i] = prefixXor ^ pref[i];
            prefixXor = prefixXor ^ result[i];
        }
        
        return result;
    }
}
