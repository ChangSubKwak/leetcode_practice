package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC1047_Remove_All_Adjacent_Duplicates_In_String_Test {
    @Test
    void test() {
        LC1047_Remove_All_Adjacent_Duplicates_In_String test = new LC1047_Remove_All_Adjacent_Duplicates_In_String();
        assertThat(test.removeDuplicates("abbaca")).isEqualTo("ca");
        assertThat(test.removeDuplicates("azxxzy")).isEqualTo("ay");
    }

    @Test
    void massiveSizeTest() {
        LC1047_Remove_All_Adjacent_Duplicates_In_String test = new LC1047_Remove_All_Adjacent_Duplicates_In_String();
        String alphabetCollection = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        while (sb.length() <= 999900) {
            sb.append(alphabetCollection);
        }
        assertThat(test.removeDuplicates(sb.toString())).isEqualTo(sb.toString());
    }
}
