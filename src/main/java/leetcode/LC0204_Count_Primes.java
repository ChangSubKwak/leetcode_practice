package leetcode;

public class LC0204_Count_Primes {
    public int countPrimes(int n) {
        boolean[] isNotPrime = new boolean[n + 1];
        if (n <= 2) {
            return 0;
        }
        
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        
        for (int i = 2; i < n; i++) {
            if (isNotPrime[i]) {
                continue;
            }
            
            for (int j = i * 2; j < n; j += i) {
                isNotPrime[j] = true;
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                count++;
            }
        }
        return count;
    }
}
