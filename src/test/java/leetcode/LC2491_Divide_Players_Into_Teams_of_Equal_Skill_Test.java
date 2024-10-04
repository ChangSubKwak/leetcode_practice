package leetcode;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class LC2491_Divide_Players_Into_Teams_of_Equal_Skill_Test {
    @Test
    void test() {
        LC2491_Divide_Players_Into_Teams_of_Equal_Skill test = new LC2491_Divide_Players_Into_Teams_of_Equal_Skill();

        assertThat(test.dividePlayers(new int[]{3, 2, 5, 1, 3, 4})).isEqualTo(22);
        assertThat(test.dividePlayers(new int[]{3, 4})).isEqualTo(12);
        assertThat(test.dividePlayers(new int[]{1, 1, 2, 3})).isEqualTo(-1);
    }
}
