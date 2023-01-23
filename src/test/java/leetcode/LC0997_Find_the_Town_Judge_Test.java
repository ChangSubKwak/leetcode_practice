package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0997_Find_the_Town_Judge_Test {
    
    @Test
    void findJudge() {
        LC0997_Find_the_Town_Judge test = new LC0997_Find_the_Town_Judge();
        assertThat(test.findJudge(2, new int[][]{{1, 2}})).isEqualTo(2);
        assertThat(test.findJudge(3, new int[][]{{1, 3}, {2, 3}})).isEqualTo(3);
        assertThat(test.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}})).isEqualTo(-1);
        assertThat(test.findJudge(3, new int[][]{{1, 2}, {2, 3}})).isEqualTo(-1);
        assertThat(test.findJudge(4, new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}})).isEqualTo(3);
        assertThat(test.findJudge(1, new int[][]{})).isEqualTo(1);
    }
}