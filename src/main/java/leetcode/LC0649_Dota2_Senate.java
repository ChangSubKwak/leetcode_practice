package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LC0649_Dota2_Senate {
    public String predictPartyVictory(String senate) {
        int length = senate.length();
        
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();
        
        for (int i = 0; i < length; i++) {
            if (senate.charAt(i) == 'R') {
                rQueue.add(i);
            } else {
                dQueue.add(i);
            }
        }
        
        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {
            int rIndex = rQueue.poll();
            int dIndex = dQueue.poll();
            
            if (dIndex < rIndex) {
                dQueue.add(dIndex + length);
            } else {
                rQueue.add(rIndex + length);
            }
        }
        
        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
}
