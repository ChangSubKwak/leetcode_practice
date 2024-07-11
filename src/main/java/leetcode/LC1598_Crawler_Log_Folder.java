package leetcode;

public class LC1598_Crawler_Log_Folder {
    public int minOperations(String[] logs) {
        int length = logs.length;
        int numberOfOperations = 0;

        for (int i = 0; i < length; i++) {
            if (logs[i].equals("./")) {
                continue;
            }

            if (logs[i].equals("../")) {
                numberOfOperations = Math.max(0, numberOfOperations - 1);
                continue;
            }
            numberOfOperations++;
        }

        return numberOfOperations;
    }
}
