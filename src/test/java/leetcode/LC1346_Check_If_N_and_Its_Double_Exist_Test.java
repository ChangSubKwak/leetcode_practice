package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1346_Check_If_N_and_Its_Double_Exist_Test {
    @Test
    void test() {
        LC1346_Check_If_N_and_Its_Double_Exist test = new LC1346_Check_If_N_and_Its_Double_Exist();

        assertThat(test.checkIfExist(new int[]{10, 2, 5, 3})).isEqualTo(true);
        assertThat(test.checkIfExist(new int[]{3, 1, 7, 11})).isEqualTo(false);
    }
}
