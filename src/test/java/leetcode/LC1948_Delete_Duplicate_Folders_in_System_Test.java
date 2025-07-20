package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LC1948_Delete_Duplicate_Folders_in_System_Test {
    @Test
    void exampleTest() {
        LC1948_Delete_Duplicate_Folders_in_System test = new LC1948_Delete_Duplicate_Folders_in_System();

        assertThat(test.deleteDuplicateFolder(Arrays.asList(
                List.of("a"), List.of("c"), List.of("d"),
                Arrays.asList("a", "b"), Arrays.asList("c", "b"), Arrays.asList("d", "a")
        ))).isEqualTo(Arrays.asList(
                List.of("d"), Arrays.asList("d", "a")
        ));

        assertThat(test.deleteDuplicateFolder(Arrays.asList(
                List.of("a"), List.of("c"), Arrays.asList("a", "b"),
                Arrays.asList("c", "b"), Arrays.asList("a", "b", "x"), Arrays.asList("a", "b", "x", "y"),
                List.of("w"), Arrays.asList("w", "y")
        ))).isEqualTo(Arrays.asList(
                List.of("c"), Arrays.asList("c", "b"), List.of("a"), Arrays.asList("a", "b")
        ));

        assertThat(test.deleteDuplicateFolder(Arrays.asList(
                Arrays.asList("a", "b"), Arrays.asList("c", "d"), List.of("c"), List.of("a")
        ))).isEqualTo(Arrays.asList(
                List.of("c"), Arrays.asList("c", "d"), List.of("a"), Arrays.asList("a", "b")
        ));
    }
}
