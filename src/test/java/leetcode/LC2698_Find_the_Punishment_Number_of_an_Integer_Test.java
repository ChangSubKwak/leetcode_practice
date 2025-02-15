package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2698_Find_the_Punishment_Number_of_an_Integer_Test {
    @Test
    void test() {
        LC2698_Find_the_Punishment_Number_of_an_Integer test = new LC2698_Find_the_Punishment_Number_of_an_Integer();

        assertThat(test.punishmentNumber(10)).isEqualTo(182);
        assertThat(test.punishmentNumber(37)).isEqualTo(1478);
    }
}
