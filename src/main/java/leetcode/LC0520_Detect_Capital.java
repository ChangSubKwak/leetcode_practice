package leetcode;

public class LC0520_Detect_Capital {
    
    public boolean detectCapitalUse(String word) {
        boolean isFirstLower = false;
        boolean isAllUpperExceptForFirst = true;
        boolean isAllLowerExceptForFirst = true;
        
        if ('a' <= word.charAt(0) && word.charAt(0) <= 'z') {
            isFirstLower = true;
        }
        
        for (int i = 1; i < word.length(); i++) {
            if ('a' <= word.charAt(i) && word.charAt(i) <= 'z') {
                isAllUpperExceptForFirst = false;
                continue;
            }
            
            if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
                isAllLowerExceptForFirst = false;
            }
        }
        
        if (isAllLowerExceptForFirst) {
            return true;
        }
        
        if (!isFirstLower && isAllUpperExceptForFirst) {
            return true;
        }
        
        return false;
    }
}
