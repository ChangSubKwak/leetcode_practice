package leetcode;

public class LC1007_Minimum_Domino_Rotations_For_Equal_Row {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int length = tops.length;
        int[] count = new int[6];
        
        for (int i = 0; i < length; i++) {
            if (tops[i] == bottoms[i]) {
                count[tops[i] - 1]++;
                continue;
            }
            count[tops[i] - 1]++;
            count[bottoms[i] - 1]++;
        }
        
        int keyNumber = 0;
        for (int i = 0; i < 6; i++) {
            if (count[i] == length) {
                keyNumber = i + 1;
                break;
            }
        }
        
        if (keyNumber == 0) {
            return -1;
        }
        
        int topKeyNumberCount = 0;
        int bottomKeyNumberCount = 0;
        for (int i = 0; i < length; i++) {
            if (tops[i] == bottoms[i]) {
                continue;
            }
            
            if (tops[i] == keyNumber) {
                topKeyNumberCount++;
            }
             
            if (bottoms[i] == keyNumber) {
                bottomKeyNumberCount++;
            }
        }
        
        return topKeyNumberCount > bottomKeyNumberCount ? bottomKeyNumberCount : topKeyNumberCount;
    }
}