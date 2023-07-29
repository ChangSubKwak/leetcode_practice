package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0808_Soup_Servings_Test {
    
    @Test
    void test() {
        LC0808_Soup_Servings test = new LC0808_Soup_Servings();
        assertThat(test.soupServings(50)).isEqualTo(0.62500);
        assertThat(test.soupServings(100)).isEqualTo(0.71875);
    }
}
