package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0948_Most_Stones_Removed_with_Same_Row_or_Column_Test {

    @Test
    void test() {
        LC0948_Most_Stones_Removed_with_Same_Row_or_Column_X test = new LC0948_Most_Stones_Removed_with_Same_Row_or_Column_X();
        assertThat(test.removeStones(new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}})).isEqualTo(5);
        assertThat(test.removeStones(new int[][]{{0,0},{0,2},{1,1},{2,0},{2,2}})).isEqualTo(3);
        assertThat(test.removeStones(new int[][]{{0,0}})).isEqualTo(0);
    }
}
