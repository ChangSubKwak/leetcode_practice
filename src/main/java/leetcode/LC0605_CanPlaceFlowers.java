package leetcode;

public class LC0605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        
        if (len == 1 && n > 2) return false;
        if (len == 1 && n == 1) return flowerbed[0] == 0; 
        
        int idx = 0;
        while (n > 0 && idx < len) {
        	if (flowerbed[idx] == 1) {
        		idx++;
        		continue;
        	}
        	
        	if (idx == 0 && flowerbed[1] == 0) {
        		n--;
        		idx+=2;
        		continue;
        	}
        	
        	if (idx > 0 && idx < len - 2 && flowerbed[idx - 1] == 0 && flowerbed[idx+1] == 0) {
        		n--;
        		idx+=2;
        		continue;
        	}
        	
        	if (idx == len -1 && flowerbed[idx - 1] == 0) {
        		n--;
        		idx+=2;
        		continue;
        	} 
        	
       		idx++;
        }
        
        return n == 0;

    }
	
	public static void main(String[] args) {
		LC0605_CanPlaceFlowers t = new LC0605_CanPlaceFlowers();
//		System.out.println(t.canPlaceFlowers(new int[] {1,0,0,0,1}, 1));
//		System.out.println(t.canPlaceFlowers(new int[] {1,0,0,0,1}, 2));
		System.out.println(t.canPlaceFlowers(new int[] {1,0,0,0,0,1}, 2));
		System.out.println(t.canPlaceFlowers(new int[] {1,0,0,0,0,0,1}, 2));
		System.out.println(t.canPlaceFlowers(new int[] {0,0,1,0,1}, 1));
		System.out.println(t.canPlaceFlowers(new int[] {1,0,0,0,1,0,0}, 2));
		System.out.println(t.canPlaceFlowers(new int[] {0}, 1));
	}
}
