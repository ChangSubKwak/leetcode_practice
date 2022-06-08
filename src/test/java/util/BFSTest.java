package util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BFSTest {
    
    Map<Integer, List<Integer>> nodeMap = new HashMap<>();
    
    @BeforeEach
    void nodeInit() {
        List<Integer> node1 = new ArrayList<>();
        node1.add(2);
        node1.add(3);
        node1.add(4);
        node1.add(5);
        nodeMap.put(1, node1);
    
        List<Integer> node2 = new ArrayList<>();
        node2.add(6);
        nodeMap.put(2, node2);
    
        List<Integer> node3 = new ArrayList<>();
        node3.add(7);
        node3.add(8);
        nodeMap.put(3, node3);
    
        List<Integer> node4 = new ArrayList<>();
        nodeMap.put(4, node4);
    
        List<Integer> node5 = new ArrayList<>();
        node5.add(9);
        node5.add(10);
        nodeMap.put(5, node5);
    }
    
    @Test
    @DisplayName("노드가 주어졌을 때, 너비탐색 결과를 반환한다")
    void BFS_test() {
        nodeInit();
        //System.out.println("nodeMap = " + nodeMap);
        BFS bfs = new BFS();
        List<Integer> result = bfs.execute(nodeMap, new HashSet<>());
        Assertions.assertThat(result).isEqualTo(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}