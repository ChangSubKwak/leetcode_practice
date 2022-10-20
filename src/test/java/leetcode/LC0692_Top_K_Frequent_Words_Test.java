package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0692_Top_K_Frequent_Words_Test {
	@Test
	void test() {
		LC0692_Top_K_Frequent_Words test = new LC0692_Top_K_Frequent_Words();
		assertThat(test.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2)).isEqualTo(Arrays.asList("i", "love"));
		assertThat(test.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4)).isEqualTo(Arrays.asList("the","is","sunny","day"));
	}
}
