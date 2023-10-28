package leetcode;

public class LC1220_Count_Vowels_Permutation {
    public int countVowelPermutation(int n) {
        int MOD = 1000_000_007;
        long previousA = 1;
        long previousE = 1;
        long previousI = 1;
        long previousO = 1;
        long previousU = 1;

        for (int x = 1; x < n; x++) {
            long currentA = previousE;
            long currentE = (previousA + previousI) % MOD;
            long currentI = (previousA + previousE + previousO + previousU) % MOD;
            long currentO = (previousI + previousU) % MOD;
            long currentU = previousA;

            previousA = currentA;
            previousE = currentE;
            previousI = currentI;
            previousO = currentO;
            previousU = currentU;
        }

        return (int)((previousA + previousE + previousI + previousO + previousU) % MOD);
    }
}
