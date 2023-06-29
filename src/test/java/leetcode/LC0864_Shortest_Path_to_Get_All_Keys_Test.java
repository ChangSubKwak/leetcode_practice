package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0864_Shortest_Path_to_Get_All_Keys_Test {

    @Test
    void test() {
        LC0864_Shortest_Path_to_Get_All_Keys test = new LC0864_Shortest_Path_to_Get_All_Keys();
        assertThat(test.shortestPathAllKeys(new String[]{"@.a..", "###.#", "b.A.B"})).isEqualTo(8);
        assertThat(test.shortestPathAllKeys(new String[]{"@..aA", "..B#.", "....b"})).isEqualTo(6);
        assertThat(test.shortestPathAllKeys(new String[]{"@Aa"})).isEqualTo(-1);
    }
}
