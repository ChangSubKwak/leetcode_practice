package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0729_My_Calendar_I {
    static class MyCalendar {
    
        List<int[]> list;
    
        public MyCalendar() {
            list = new ArrayList<>();
        }
    
        public boolean book(int start, int end) {
            for (int[] i: list) {
                int first  = i[0];
                int second = i[1];
            
                if (first <= start && start < second) {
                    return false;
                }
            
                if (first < end && end < second) {
                    return false;
                }
            
                if (start < first && second <= end) {
                    return false;
                }
            }
        
            list.add(new int[]{start, end});
        
            return true;
        }
    }
}
