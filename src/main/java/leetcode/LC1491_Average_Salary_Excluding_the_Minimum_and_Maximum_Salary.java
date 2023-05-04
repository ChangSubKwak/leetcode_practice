package leetcode;

public class LC1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public double average(int[] salary) {
        int min = 1000001;
        int minIndex = 0;
        int max = 999;
        int maxIndex = 0;

        for (int i = 0; i < salary.length; i++) {
            if (min > salary[i]) {
                min = salary[i];
                minIndex = i;
            }

            if (max < salary[i]) {
                max = salary[i];
                maxIndex = i;
            }
        }

        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (i == minIndex || i == maxIndex) {
                continue;
            }
            sum += salary[i];
        }

        return sum * 1.0 / (salary.length - 2);
    }
}
