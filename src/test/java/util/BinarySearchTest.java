package util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTest {
    @Test
    void test1() {
        int[] array = {10, 20, 30, 40, 50};

        assertThat(Arrays.binarySearch(array, 40)).isEqualTo(3);
        assertThat(Arrays.binarySearch(array, 39)).isEqualTo(-4);
        assertThat(Arrays.binarySearch(array, 41)).isEqualTo(-5);
    }
}
