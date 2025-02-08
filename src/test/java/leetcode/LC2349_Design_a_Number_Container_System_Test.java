package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2349_Design_a_Number_Container_System_Test {
    @Test
    void exampleTest() {
        LC2349_Design_a_Number_Container_System.NumberContainers test = new LC2349_Design_a_Number_Container_System.NumberContainers();

        assertThat(test.find(10)).isEqualTo(-1);

        test.change(2, 10);
        test.change(1, 10);
        test.change(3, 10);
        test.change(5, 10);

        assertThat(test.find(10)).isEqualTo(1);

        test.change(1, 20);

        assertThat(test.find(10)).isEqualTo(2);
    }
}
