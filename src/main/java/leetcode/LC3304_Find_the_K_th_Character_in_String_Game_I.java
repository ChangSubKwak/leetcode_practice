package leetcode;

public class LC3304_Find_the_K_th_Character_in_String_Game_I {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();

        while (k > sb.length()) {

            if (sb.length() == 0) {
                sb.append("a");
                continue;
            }

            int length = sb.length();
            for (int i = 0; i < length; i++) {
                int next = (sb.charAt(i) - 'a' + 1) % 26;
                sb.append((char)('a' + next));
            }
        }

        return sb.charAt(k - 1);
    }
}
