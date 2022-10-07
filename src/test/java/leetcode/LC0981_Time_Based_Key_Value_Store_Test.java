package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0981_Time_Based_Key_Value_Store_Test {
    @Test
    void test() {
        LC0981_Time_Based_Key_Value_Store.TimeMap test = new LC0981_Time_Based_Key_Value_Store.TimeMap();
        test.set("foo", "bar", 1);
        assertThat(test.get("foo", 1)).isEqualTo("bar");
        assertThat(test.get("foo", 3)).isEqualTo("bar");
        test.set("foo", "bar2", 4);
        assertThat(test.get("foo", 4)).isEqualTo("bar2");
        assertThat(test.get("foo", 5)).isEqualTo("bar2");
    }
}
