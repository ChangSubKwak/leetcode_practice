package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0406_Queue_Reconstruction_by_Height_Test {
    LC0406_Queue_Reconstruction_by_Height test;
    
    @BeforeEach
    void setUp() {
        test = new LC0406_Queue_Reconstruction_by_Height();
    }
    
    @Test
    void minimumTotal() {
        assertThat(test.reconstructQueue(new int[][] { {7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2} })).isEqualTo(
            new int[][] {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}}
        );
        
        assertThat(test.reconstructQueue(new int[][] {{6, 0}, {5, 0}, {4, 0}, {3, 2}, {2, 2}, {1 ,4}})).isEqualTo(
            new int[][] {{4, 0}, {5, 0}, {2, 2}, {3, 2}, {1, 4}, {6 ,0}}
        );
    }
}
