package leetcode;

public class LC0739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        
        int[] answer = new int[length];
        for (int i = 0; i < temperatures.length; i++) {
            answer[i] = 0;
            for (int j = i + 1; j < length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    answer[i] = j - i;
                    break;
                }
            }
        }
        
        return answer;
    }
}
