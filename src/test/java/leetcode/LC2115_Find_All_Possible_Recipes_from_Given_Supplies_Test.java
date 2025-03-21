package leetcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.*;

class LC2115_Find_All_Possible_Recipes_from_Given_Supplies_Test {

    @Test
    void test() {
        LC2115_Find_All_Possible_Recipes_from_Given_Supplies test = new LC2115_Find_All_Possible_Recipes_from_Given_Supplies();

        assertThat(test.findAllRecipes(
                new String[]{"bread"},
                Arrays.asList(
                        Arrays.asList("yeast", "flour")
                ),
                new String[]{"yeast", "flour", "corn"}
        )).isEqualTo(new String[]{"bread"});

        assertThat(test.findAllRecipes(
                new String[]{"bread", "sandwich"},
                Arrays.asList(
                        Arrays.asList("yeast", "flour"),
                        Arrays.asList("bread", "meat")
                ),
                new String[]{"yeast", "flour", "meat"}
        )).isEqualTo(new String[]{"bread", "sandwich"});

        assertThat(test.findAllRecipes(
                new String[]{"bread", "sandwich", "burger"},
                Arrays.asList(
                        Arrays.asList("yeast", "flour"),
                        Arrays.asList("bread", "meat"),
                        Arrays.asList("sandwich", "meat", "bread")
                ),
                new String[]{"yeast", "flour", "meat"}
        )).isEqualTo(new String[]{"bread", "sandwich", "burger"});
    }
}
