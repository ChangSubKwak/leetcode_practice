package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0649_Dota2_Senate_Test {

	@Test
	void test() {
		LC0649_Dota2_Senate test = new LC0649_Dota2_Senate();
		assertThat(test.predictPartyVictory("RD")).isEqualTo("Radiant");
		assertThat(test.predictPartyVictory("RDD")).isEqualTo("Dire");
	}
}
