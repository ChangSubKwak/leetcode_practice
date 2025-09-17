package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2353_Design_a_Food_Rating_System_Test {

    @Test
    void exampleTest() {
        LC2353_Design_a_Food_Rating_System.FoodRatings test = new LC2353_Design_a_Food_Rating_System.FoodRatings(
                new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
                new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
                new int[]{9, 12, 8, 15, 14, 7}
        );

        assertThat(test.highestRated("korean")).isEqualTo("kimchi");
        assertThat(test.highestRated("korean")).isEqualTo("ramen");

        test.changeRating("sushi", 16);
        assertThat(test.highestRated("japanese")).isEqualTo("sushi");

        test.changeRating("ramen", 16);
        assertThat(test.highestRated("japanese")).isEqualTo("ramen");
    }
}
