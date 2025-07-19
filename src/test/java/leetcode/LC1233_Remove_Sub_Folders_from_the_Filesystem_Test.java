package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LC1233_Remove_Sub_Folders_from_the_Filesystem_Test {
    
    @Test
    void test() {
        LC1233_Remove_Sub_Folders_from_the_Filesystem test = new LC1233_Remove_Sub_Folders_from_the_Filesystem();

        assertThat(test.removeSubfolders(new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"})).isEqualTo(Arrays.asList("/a", "/c/d", "/c/f"));
        assertThat(test.removeSubfolders(new String[]{"/a", "/a/b/c", "/a/b/d"})).isEqualTo(List.of("/a"));
        assertThat(test.removeSubfolders(new String[]{"/a/b/c", "/a/b/ca", "/a/b/d"})).isEqualTo(Arrays.asList("/a/b/c", "/a/b/ca", "/a/b/d"));
    }
}
