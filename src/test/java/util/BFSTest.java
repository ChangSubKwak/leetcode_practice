package util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

class BFSTest {
    
    Map<Integer, List<Integer>> nodes;
    
    // 0 ____ 1 ____ 5
    //   |___ 2 ____ 6
    //   |      |___ 7
    //   |___ 3
    //   |___ 4 ____ 8
    //          |___ 9
    //
    // RESULT : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    
    @BeforeEach
    void nodeInit() {
        nodes = new HashMap<>();
        
        List<Integer> node0 = new ArrayList<>();
        node0.add(1);
        node0.add(2);
        node0.add(3);
        node0.add(4);
        nodes.put(0, node0);
    
        List<Integer> node1 = new ArrayList<>();
        node1.add(5);
        nodes.put(1, node1);
    
        List<Integer> node2 = new ArrayList<>();
        node2.add(6);
        node2.add(7);
        nodes.put(2, node2);
    
        List<Integer> node3 = new ArrayList<>();
        nodes.put(3, node3);
    
        List<Integer> node4 = new ArrayList<>();
        node4.add(8);
        node4.add(9);
        nodes.put(4, node4);
    }
    
    @Test
    @DisplayName("노드가 주어졌을 때, 너비탐색 결과를 반환한다")
    void BFS_test() {
        nodeInit();
        System.out.println("nodes = " + nodes);
        BFS bfs = new BFS();
        List<Integer> result = bfs.execute(nodes);
        Assertions.assertThat(result).isEqualTo(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}