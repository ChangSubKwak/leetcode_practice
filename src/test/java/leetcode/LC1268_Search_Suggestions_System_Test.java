package leetcode;

import java.util.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class LC1268_Search_Suggestions_System_Test {
    LC1268_Search_Suggestions_System test;

    @BeforeEach
    void setUp() {
        test = new LC1268_Search_Suggestions_System();
    }

    @Test
    void test() {
        Assertions.assertThat(test.suggestedProducts(new String[] {"mobile" ,"mouse" ,"moneypot" ,"monitor" ,"mousepad"}, "mouse")).isEqualTo(
            Arrays.asList(
                Arrays.asList(new String[] {"mobile" ,"moneypot" ,"monitor"}),
                Arrays.asList(new String[] {"mobile" ,"moneypot" ,"monitor"}),
                Arrays.asList(new String[] {"mouse" ,"mousepad"}),
                Arrays.asList(new String[] {"mouse" ,"mousepad"}),
                Arrays.asList(new String[] {"mouse" ,"mousepad"})
            )
        );
    }
}
