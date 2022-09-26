package leetcode;

public class LC0990_Satisfiability_of_Equality_Equations {
    private int[] parent = new int[26];

    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        for (String equation : equations) {
            if (equation.charAt(1) == '=') {
                parent[find(equation.charAt(0) - 'a')] = find(equation.charAt(3) - 'a');
            }
        }

        for (String equation : equations) {
            if (equation.charAt(1) == '!' && find(equation.charAt(0) - 'a') == find(equation.charAt(3) - 'a')) {
                return false;
            }
        }

        return true;
    }

    private int find(int x) {
        if (x != parent[x]) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
}
