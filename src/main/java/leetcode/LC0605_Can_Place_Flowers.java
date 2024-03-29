package leetcode;

public class LC0605_Can_Place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean isEmptyLeft  = (i == 0) || (flowerbed[i - 1] == 0);
                boolean isEmptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (isEmptyLeft && isEmptyRight) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        return count >= n;
    }
}
