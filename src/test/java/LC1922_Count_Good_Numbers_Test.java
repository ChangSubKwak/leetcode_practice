import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LC1922_Count_Good_Numbers_Test {
    @Test
    void examlpeTest() {
        LC1922_Count_Good_Numbers test = new LC1922_Count_Good_Numbers();

        assertThat(test.countGoodNumbers(1)).isEqualTo(5);
        assertThat(test.countGoodNumbers(4)).isEqualTo(400);
        assertThat(test.countGoodNumbers(50)).isEqualTo(564908303);
    }
}
