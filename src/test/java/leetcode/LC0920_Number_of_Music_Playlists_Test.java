package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LC0920_Number_of_Music_Playlists_Test {
    @Test
    void test() {
        LC0920_Number_of_Music_Playlists test = new LC0920_Number_of_Music_Playlists();
        assertThat(test.numMusicPlaylists(3, 3, 1)).isEqualTo(6);
        assertThat(test.numMusicPlaylists(2, 3, 0)).isEqualTo(6);
        assertThat(test.numMusicPlaylists(2, 3, 1)).isEqualTo(2);
    }
}
