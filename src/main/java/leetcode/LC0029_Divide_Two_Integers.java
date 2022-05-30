package leetcode;

public class LC0029_Divide_Two_Integers {
	public int divide(int dividend, int divisor) {
		int sign = 1;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
			sign = -1;
		}

		long longDividend = Math.abs((long) dividend);
		long longDivisor = Math.abs((long) divisor);

		if ((longDividend == 0) || (longDividend < longDivisor))	{
			return 0;
		}

		long longAnswer = ldivide(longDividend, longDivisor);

		int ans;
		if (longAnswer > Integer.MAX_VALUE) {
			ans = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
		} else {
			ans = (int) (sign * longAnswer);
		}

		return ans;
	}

	private long ldivide(long longDividend, long longDivisor) {
		if (longDividend < longDivisor) {
			return 0;
		}

		long sum = longDivisor;
		long multiple = 1;

		while ((sum+sum) <= longDividend) {
			sum += sum;
			multiple += multiple;
		}

		return multiple + ldivide(longDividend - sum, longDivisor);
	}
}
