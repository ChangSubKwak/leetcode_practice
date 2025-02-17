package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1079_Letter_Tile_Possibilities_Test {
    @Test
    void test() {
        LC1079_Letter_Tile_Possibilities test = new LC1079_Letter_Tile_Possibilities();

        assertThat(test.numTilePossibilities("AAB")).isEqualTo(8);
        assertThat(test.numTilePossibilities("AAABBC")).isEqualTo(188);
        assertThat(test.numTilePossibilities("V")).isEqualTo(1);
    }
}
