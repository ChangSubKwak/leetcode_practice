package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2024_Maximize_the_Confusion_of_an_Exam_Test {
    @Test
    void exampleTest() {
        LC2024_Maximize_the_Confusion_of_an_Exam test = new LC2024_Maximize_the_Confusion_of_an_Exam();
        assertThat(test.maxConsecutiveAnswers("TTFF", 2)).isEqualTo(4);
        assertThat(test.maxConsecutiveAnswers("TFFT", 1)).isEqualTo(3);
        assertThat(test.maxConsecutiveAnswers("TTFTTFTT", 1)).isEqualTo(5);
    }
}
