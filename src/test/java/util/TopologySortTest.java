package util;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

class TopologySortTest {
    // 1 ---→ 2 ---→ 3 ---→ 4
    //     |         ------←|
    //     |         ↓
    //     |→ 5 ---→ 6 ---→ 7
    // 1 → 2 → 5 → 3 → 4 → 6 → 7

    TopologySort ts;
    Map<Integer, List<Integer>> nodeIncomes;

    @BeforeEach
    void setup() {
        ts = new TopologySort();
        nodeIncomes = new HashMap<>();
        nodeIncomes.put(1, new ArrayList<>());
        nodeIncomes.put(2, Arrays.asList(1));
        nodeIncomes.put(3, Arrays.asList(2));
        nodeIncomes.put(4, Arrays.asList(3));
        nodeIncomes.put(5, Arrays.asList(1));
        nodeIncomes.put(6, Arrays.asList(4, 5));
        nodeIncomes.put(7, Arrays.asList(6));
    }

    @DisplayName("진입차수를 가진 노드가 주어졌을 때, 위상정렬을 수행한다")
    @Test
    void test() {
        assertThat(ts.execute(nodeIncomes)).isEqualTo(Arrays.asList(1, 2, 5, 3, 4, 6, 7));
    }
}
