package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0332_Reconstruct_Itinerary_Test {

    @Test
    void test() {
        LC0332_Reconstruct_Itinerary test = new LC0332_Reconstruct_Itinerary();
        assertThat(test.findItinerary(
            Arrays.asList(
                Arrays.asList("MUC","LHR"),
                Arrays.asList("JFK","MUC"),
                Arrays.asList("SFO","SJC"),
                Arrays.asList("LHR","SFO")
            )
        )).isEqualTo(
            Arrays.asList("JFK","MUC","LHR","SFO","SJC")
        );

        assertThat(test.findItinerary(
            Arrays.asList(
                Arrays.asList("JFK","SFO"),
                Arrays.asList("JFK","ATL"),
                Arrays.asList("SFO","ATL"),
                Arrays.asList("ATL","JFK"),
                Arrays.asList("ATL","SFO")
            )
        )).isIn(
            Arrays.asList("JFK","MUC","LHR","SFO","SJC"),
            Arrays.asList("JFK","SFO","ATL","JFK","ATL","SFO")
        );
    }
}
