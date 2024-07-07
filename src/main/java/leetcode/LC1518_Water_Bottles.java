package leetcode;

public class LC1518_Water_Bottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = 0;

        result += numBottles;

        while (numBottles >= numExchange) {
            result += (int)(numBottles / numExchange);
            numBottles = (int)(numBottles / numExchange) + numBottles % numExchange;
        }

        return result;
    }
}
