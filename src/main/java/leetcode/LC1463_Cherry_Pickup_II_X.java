package leetcode;

public class LC1463_Cherry_Pickup_II_X {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");

        int length = s1.length > s2.length ? s1.length : s2.length;
        
        for (int i = 0; i < length; i++) {
            int value1 = 0;
            int value2 = 0;
            
            if (i < s1.length) {
                value1 =  Integer.valueOf(s1[i]);
            }
            
            if (i < s2.length) {
                value2 =  Integer.valueOf(s2[i]);
            } 
            
            if (value1 < value2) {
                return -1;
            }
            
            if (value1 > value2) {
                return 1;
            }
        }
                
        return 0;
    }
}
