package leetcode;

public class LC3136_Valid_Word {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;
        boolean hasDigit = false;
        for (char c : word.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                hasVowel = true;
                continue;
            }

            if ('0' <= c && c <= '9') {
                hasDigit = true;
                continue;
            }

            if ('a' <= c && c <= 'z') {
                hasConsonant = true;
                continue;
            }

            return false;
        }

        if (!hasVowel || !hasConsonant) {
            return false;
        }

        return true;
    }
}
