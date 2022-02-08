package leetcode;

public class LC0258_Add_Digits {
    public int addDigits(int num) {
        int result;
        do {
            result = 0;
            while (num != 0) {
                result += num % 10;
                num /= 10;
            }
            num = result;
        } while(result >= 10);
            
        return result;
    }
}
