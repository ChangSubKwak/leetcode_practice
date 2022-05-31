package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC1461_Check_If_a_String_Contains_All_Binary_Codes_of_Size_K_X {
    public boolean hasAllCodes(String s, int k) {
        int need = 1 << k;
        Set<String> set = new HashSet<String>();

        for (int i = k; i <= s.length(); i++) {
            String cutString = s.substring(i - k, i);
            if (!set.contains(cutString)) {
                set.add(cutString);
                need--;

                if (need == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
