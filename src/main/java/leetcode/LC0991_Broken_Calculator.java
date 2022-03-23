package leetcode;

public class LC0991_Broken_Calculator {
    public int brokenCalc(int startValue, int target) {
        int calcCount = 0;
        while(target > startValue) {
            calcCount++;
            if (target % 2 == 1) {
                target++;
                continue;
            }
            target /= 2;
        }
        return calcCount + startValue - target;
    }
}
