package leetcode;

public class LC2109_Adding_Spaces_to_a_String {
        public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < spaces.length; i++) {
            sb.insert(i + spaces[i], ' ');
        }

        return sb.toString();
    }
}
