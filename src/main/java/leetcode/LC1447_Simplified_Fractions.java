package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC1447_Simplified_Fractions {
    public List<String> simplifiedFractions(int n) {
        Set<String> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (j == 1) {
                    set.add(j + "/" + i);
                    continue;
                }
                
                int denominator = i;
                int numerator = j;
                
                for (int k = 2; k <= numerator; k++) {
                    if (denominator % k == 0 && numerator % k == 0) {
                        denominator /= k;
                        numerator /= k;
                        
                        k = 1;
                        continue;
                    }
                }
                if (numerator == 2 && denominator == 4) {
                    System.out.println(j + "/" + i);
                }
                set.add(numerator + "/" + denominator);
            }
        }
        
        return new ArrayList<>(set);
    }
}
