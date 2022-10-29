package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0049_Group_Anagrams_Test {

	@Test
	void test() {
		LC0049_Group_Anagrams test = new LC0049_Group_Anagrams();

		List<List<String>> result = test.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
		result.forEach(e -> {
			e.sort(Comparator.naturalOrder());
		});

		assertThat(result).contains(
			Arrays.asList("bat"),
			Arrays.asList("nat", "tan"),
			Arrays.asList("ate", "eat", "tea")
		);

		assertThat(test.groupAnagrams(new String[]{""})).isEqualTo(
			Arrays.asList(
				Arrays.asList("")
			)
		);

		assertThat(test.groupAnagrams(new String[]{"a"})).isEqualTo(
			Arrays.asList(
				Arrays.asList("a")
			)
		);
	}
}
