package leetcode;

public class LC1601_Maximum_Number_of_Achievable_Transfer_Requests {
<<<<<<< HEAD
    private int answer;
=======
    private int answer = 0;
>>>>>>> e3e0df3 (feat: solved - 1601. Maximum Number of Achievable Transfer Requests)

    private void maxRequest(int[][] requests, int[] indegree, int n, int index, int count) {
        if (index == requests.length) {
            for (int i = 0; i < n; i++) {
                if (indegree[i] != 0) {
                    return;
                }
            }

            answer = Math.max(answer, count);
            return;
        }

        int from = requests[index][0];
        int to   = requests[index][1];
        indegree[from]--;
        indegree[to]++;
        maxRequest(requests, indegree, n, index + 1, count + 1);
        indegree[from]++;
        indegree[to]--;
        maxRequest(requests, indegree, n, index + 1, count);
    }

    public int maximumRequests(int n, int[][] requests) {
<<<<<<< HEAD
        answer = 0;
=======
>>>>>>> e3e0df3 (feat: solved - 1601. Maximum Number of Achievable Transfer Requests)
        int[] indegree = new int[n];
        maxRequest(requests, indegree, n, 0, 0);

        return answer;
    }
}
