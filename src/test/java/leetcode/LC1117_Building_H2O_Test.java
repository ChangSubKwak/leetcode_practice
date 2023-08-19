package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1117_Building_H2O_Test {
    
    @Test
    void test() throws InterruptedException {
        LC1117_Building_H2O.H2O test = new LC1117_Building_H2O.H2O();

        executeThread(test, "HOH");
        assertThat(test.result()).isEqualTo("HHO");

        test = new LC1117_Building_H2O.H2O();
        executeThread(test, "OOHHHH");
        assertThat(test.result()).isEqualTo("HHOHHO");
    }

    private static void executeThread(LC1117_Building_H2O.H2O test, String water) throws InterruptedException {
        int totalCount = water.length() / 3;
        int hydrogenCount = 2;
        int oxygenCount = 1;

        for (int i = 0; i < totalCount; i++) {
            for (int j = 0; j < hydrogenCount; j++) {
                test.hydrogen(() -> {
                    test.addResult("H");
                });
            }
            for (int j = 0; j < oxygenCount; j++) {
                test.oxygen(() -> {
                    test.addResult("O");
                });
            }
        }
    }
}
