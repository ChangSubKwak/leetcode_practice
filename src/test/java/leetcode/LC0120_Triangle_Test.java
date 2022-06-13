package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class LC0120_Triangle_Test {
    LC0120_Triangle lc;
    
    @BeforeEach
    void setUp() {
        lc = new LC0120_Triangle();
    }
    
    @Test
    void minimumTotal() {
        Integer[][] triangle = new Integer[][] {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}};
        List<List<Integer>> triangleList = Arrays.stream(triangle).map(Arrays::asList).collect(Collectors.toList());
        assertThat(lc.minimumTotal(triangleList)).isEqualTo(11);
    }
}