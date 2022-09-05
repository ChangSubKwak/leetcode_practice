package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0429_N_ary_Tree_Level_Order_Traversal_Test {
    LC0429_N_ary_Tree_Level_Order_Traversal test;
    
    @BeforeEach
    void setUp() {
        test = new LC0429_N_ary_Tree_Level_Order_Traversal();
    }
    
    @Test
    void test() {
        Node root = new Node(1, new ArrayList<>());
        List<Node> childrenList1 = new ArrayList<>();
        childrenList1.add(new Node(3, new ArrayList<>()));
        childrenList1.add(new Node(2, new ArrayList<>()));
        childrenList1.add(new Node(4, new ArrayList<>()));
        root.children = childrenList1;

        List<Node> childrenList2 = new ArrayList<>();
        childrenList2.add(new Node(5, new ArrayList<>()));
        childrenList2.add(new Node(6, new ArrayList<>()));

        Node three = childrenList1.get(0);
        three.children = childrenList2;
        childrenList1.set(0, three);

        assertThat(test.levelOrder(root)).isEqualTo(Arrays.asList(
            Arrays.asList(1),
            Arrays.asList(3, 2, 4),
            Arrays.asList(5, 6)
            )
        );
    }
}
