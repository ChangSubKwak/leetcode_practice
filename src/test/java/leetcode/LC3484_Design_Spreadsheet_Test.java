package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3484_Design_Spreadsheet_Test {
    @Test
    void test() {
        LC3484_Design_Spreadsheet.Spreadsheet test = new LC3484_Design_Spreadsheet.Spreadsheet(3);

        assertThat(test.getValue("=5+7")).isEqualTo(12);

        test.setCell("A1", 10);
        assertThat(test.getValue("=A1+6")).isEqualTo(16);

        test.setCell("B2", 15);
        assertThat(test.getValue("=A1+B2")).isEqualTo(25);

        test.resetCell("A1");
        assertThat(test.getValue("=A1+B2")).isEqualTo(15);
    }
}
