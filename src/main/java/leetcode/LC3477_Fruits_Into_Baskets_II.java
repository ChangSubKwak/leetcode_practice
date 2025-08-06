package leetcode;

public class LC3477_Fruits_Into_Baskets_II {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < baskets.length; j++) {
                if (fruits[i] <= baskets[j]) {
                    baskets[j] = 0;
                    break;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < baskets.length; i++) {
            if (baskets[i] != 0) {
                count++;
            }
        }

        return count;
    }
}
