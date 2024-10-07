package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class LC1813_Sentence_Similarity_III {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        Deque<String> deque1 = new ArrayDeque<>(Arrays.asList(sentence1.split(" ")));
        Deque<String> deque2 = new ArrayDeque<>(Arrays.asList(sentence2.split(" ")));

        while (true) {
            if (deque1.size() == 0) {
                break;
            }

            if (deque2.size() == 0) {
                break;
            }

            String leftMostValue1 = deque1.peek();
            String leftMostValue2 = deque2.peek();

            if (!leftMostValue1.equals(leftMostValue2)) {
                break;
            }

            deque1.poll();
            deque2.poll();
        }

        while (true) {
            if (deque1.size() == 0) {
                break;
            }

            if (deque2.size() == 0) {
                break;
            }

            String rightMostValue1 = deque1.peekLast();
            String rightMostValue2 = deque2.peekLast();

            if (!rightMostValue1.equals(rightMostValue2)) {
                break;
            }

            deque1.pollLast();
            deque2.pollLast();
        }

        return deque1.size() == 0 || deque2.size() == 0;
    }
}
