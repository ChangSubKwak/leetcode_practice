package leetcode;

public class LC1662_Check_If_Two_String_Arrays_are_Equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder concatnatedWord1 = new StringBuilder();
        StringBuilder concatnatedWord2 = new StringBuilder();

        for (String word : word1) {
            concatnatedWord1.append(word);
        }

        for (String word : word2) {
            concatnatedWord2.append(word);
        }

        return concatnatedWord1.toString().equals(concatnatedWord2.toString());
    }
}
