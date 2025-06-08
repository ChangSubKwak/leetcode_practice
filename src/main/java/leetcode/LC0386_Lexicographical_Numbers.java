package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0386_Lexicographical_Numbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            generate(i, n, numbers);
        }
        return numbers;
    }

    private void generate(int current, int limit, List<Integer> result) {
        if (current > limit) {
            return;
        }

        result.add(current);

        for (int i = 0; i <= 9; i++) {
            int next = current * 10 + i;

            if (next <= limit) {
                generate(next, limit, result);
                continue;
            }

            break;
        }
    }
}
