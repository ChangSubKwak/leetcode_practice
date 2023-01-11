package util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinarySearchTest {
    @Test
    void test1() {
        int[] array = {10, 20, 30, 40, 50};

        Assertions.assertThat(Arrays.binarySearch(array, 40)).isEqualTo(3);
        Assertions.assertThat(Arrays.binarySearch(array, 39)).isEqualTo(-4);
        Assertions.assertThat(Arrays.binarySearch(array, 41)).isEqualTo(-5);
    }
}
