package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC0133_Clone_Graph_Test {

    @Test
    void test() {
        LC0133_Clone_Graph test = new LC0133_Clone_Graph();

        LC0133_Clone_Graph.Node one   = new LC0133_Clone_Graph.Node(1);
        LC0133_Clone_Graph.Node two   = new LC0133_Clone_Graph.Node(2);
        LC0133_Clone_Graph.Node three = new LC0133_Clone_Graph.Node(3);
        LC0133_Clone_Graph.Node four  = new LC0133_Clone_Graph.Node(4);

        one.neighbors.addAll(Arrays.asList(two, four));
        two.neighbors.addAll(Arrays.asList(one, three));
        three.neighbors.addAll(Arrays.asList(two, four));
        four.neighbors.addAll(Arrays.asList(one, three));
    }
}