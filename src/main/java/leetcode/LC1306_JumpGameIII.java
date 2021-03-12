package main.java.leetcode;

public class LC1306_JumpGameIII {
	public boolean execute(boolean[] isVisit, int[] arr, int start) {
		if (start < 0 || start >= arr.length)
			return false;

		if (arr[start] == 0)
			return true;

		if (isVisit[start])
			return false;
		isVisit[start] = true;

		if (execute(isVisit, arr, start + arr[start]))
			return true;
		if (execute(isVisit, arr, start - arr[start]))
			return true;

		return false;
	}

	public boolean canReach(int[] arr, int start) {
		boolean[] isVisit = new boolean[arr.length];
		return execute(isVisit, arr, start);
	}

	public static void main(String[] args) {
		LC1306_JumpGameIII t = new LC1306_JumpGameIII();
		System.out.println(t.canReach(new int[] { 4, 2, 3, 0, 3, 1, 2 }, 5));
		System.out.println(t.canReach(new int[] { 4, 2, 3, 0, 3, 1, 2 }, 0));
		System.out.println(t.canReach(new int[] { 3, 0, 2, 1, 2 }, 2));
	}
}
