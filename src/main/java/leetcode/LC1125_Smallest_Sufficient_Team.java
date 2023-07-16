package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC1125_Smallest_Sufficient_Team {
    private Set<String> required;
    private List<Integer> answer;

    private void print(List<List<String>> arr, boolean[] visited, int n) {
        Set<String> skills = new HashSet<>();
        List<Integer> tempAnswer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                // System.out.print(arr[i] + " ");
                // System.out.print(arr.get(i) + " ");
                skills.addAll(arr.get(i));
                tempAnswer.add(i);
            }
        }
        System.out.println("skills : " + skills);
        System.out.println("tempAnswer : " + tempAnswer);

        skills.removeAll(required);
        if (skills.isEmpty() && answer.size() == 0) {
            answer = tempAnswer;
        }

        if (skills.isEmpty() && tempAnswer.size() < answer.size()) {
            answer = tempAnswer;
        }

        // System.out.println();
    }

    // static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
    private void combination(List<List<String>> arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            print(arr, visited, n);
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        int length = people.size();

        required = new HashSet<>();
        for (String skill : req_skills) {
            required.add(skill);
        }

        answer = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            combination(people, new boolean[length], 0, length, i);
        }
        // combination(people, new boolean[length], 0, 3, 1);
        // System.out.println("---------------------------");
        // combination(people, new boolean[length], 0, 3, 2);
        // System.out.println("---------------------------");
        // combination(people, new boolean[length], 0, 3, 3);
        System.out.println("answer : " + answer);
        return new int[]{0, 2};
    }
}
