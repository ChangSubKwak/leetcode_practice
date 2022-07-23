package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC0820_Short_Encoding_of_Words_Test {
    
    LC0820_Short_Encoding_of_Words test;
    
    @BeforeEach
    void setUp() {
        test = new LC0820_Short_Encoding_of_Words();
    }
    
    @Test
    void test() {
        assertThat(test.minimumLengthEncoding(new String[]{"p", "grah", "qwosp"})).isEqualTo(11);
        assertThat(test.minimumLengthEncoding(new String[]{"feipyxx", "e"})).isEqualTo(10);
        assertThat(test.minimumLengthEncoding(new String[]{"time", "me", "bell"})).isEqualTo(10);
        assertThat(test.minimumLengthEncoding(new String[]{"t"})).isEqualTo(2);
        assertThat(test.minimumLengthEncoding(new String[]{"me", "time"})).isEqualTo(5);
    }
}
