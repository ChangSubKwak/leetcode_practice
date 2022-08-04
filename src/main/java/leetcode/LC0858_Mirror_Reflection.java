package leetcode;

public class LC0858_Mirror_Reflection {
    public int mirrorReflection(int p, int q) {
        int count = 1;
        int newP = p;
        while (newP % q != 0) {
            count++;
            newP = p * count;
        }
        
        p = newP;
        if (count % 2 == 1) {
            return (p / q) % 2 == 0 ? 2 : 1;
        }
        
        return (p / q) % 2 == 0 ? 2 : 0;
    }
}
