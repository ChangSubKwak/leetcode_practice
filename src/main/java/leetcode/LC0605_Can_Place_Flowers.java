package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0605_Can_Place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 1) {
                return n == 0;
            }
            if (flowerbed[0] == 0) {
                return n <= 1;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                list.add(i);
            }
        }
        
        if (list.size() == 0) {
            return ((flowerbed.length + 1) / 2 ) >= n;
        }
        
        int max = 0;
        if (list.get(0) != 0) {
            max += list.get(0) / 2;
        }
        
        if (list.get(list.size() - 1) != flowerbed.length - 1) {
            max += ( flowerbed.length - 1 - list.get(list.size() - 1)) / 2;
        }

        for (int i = 1; i < list.size(); i++) {
            int width = (list.get(i) - list.get(i-1) - 1);
            
            if (width <= 2) {
                continue;
            }
            
            if (width <= 4) {
                max++;
                continue;
            }
            max += ((width - 1) / 2);
        }
       
        return max >= n;
    }
	
	
	/*
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
    */
	

}
