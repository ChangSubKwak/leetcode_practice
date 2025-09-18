package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3408_Design_Task_Manager_Test {
    @Test
    void test() {
        LC3408_Design_Task_Manager.TaskManager test = new LC3408_Design_Task_Manager.TaskManager(Arrays.asList(
                Arrays.asList(1, 101, 10),
                Arrays.asList(2, 102, 20),
                Arrays.asList(3, 103, 15)
        ));


    }
}
