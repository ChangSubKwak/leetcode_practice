package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1345_Jump_Game_IV_Test {
    @Test
    void test() {
        LC1345_Jump_Game_IV test = new LC1345_Jump_Game_IV();
        assertThat(test.minJumps(new int[]{100,-23,-23,404,100,23,23,23,3,404})).isEqualTo(3);
        assertThat(test.minJumps(new int[]{7})).isEqualTo(0);
        assertThat(test.minJumps(new int[]{7,6,9,6,9,6,9,7})).isEqualTo(1);
    }
}
