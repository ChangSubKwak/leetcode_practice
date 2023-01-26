package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC0787_Cheapest_Flights_Within_K_Stops_Test {
	@Test
	void test() {
		LC0787_Cheapest_Flights_Within_K_Stops test = new LC0787_Cheapest_Flights_Within_K_Stops();

		assertThat(test.findCheapestPrice(4,
			new int[][]{{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}},
			0, 3, 1)).isEqualTo(700);

		assertThat(test.findCheapestPrice(3,
			new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}},
			0, 2, 1)).isEqualTo(200);

		assertThat(test.findCheapestPrice(3,
			new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}},
			0, 2, 0)).isEqualTo(500);
	}
}
