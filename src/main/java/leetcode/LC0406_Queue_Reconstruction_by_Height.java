package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC0406_Queue_Reconstruction_by_Height {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        System.out.println(Arrays.deepToString(people));
    
        List<int[]> ordered = new LinkedList<>();
        for (int[] p: people) {
            ordered.add(p[1], p);
        }
    
        System.out.print(Arrays.deepToString(ordered.toArray(new int[people.length][2])));
    
        return ordered.toArray(new int[people.length][2]);
    }
}
