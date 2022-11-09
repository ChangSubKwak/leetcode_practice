package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0901_Online_Stock_Span_Test {
    @Test
    void test() {
        LC0901_Online_Stock_Span.StockSpanner test = new LC0901_Online_Stock_Span.StockSpanner();
        assertThat(test.next(100)).isEqualTo(1);
        assertThat(test.next(80)).isEqualTo(1);
        assertThat(test.next(60)).isEqualTo(1);
        assertThat(test.next(70)).isEqualTo(2);
        assertThat(test.next(60)).isEqualTo(1);
        assertThat(test.next(75)).isEqualTo(4);
        assertThat(test.next(85)).isEqualTo(6);
    }
}
