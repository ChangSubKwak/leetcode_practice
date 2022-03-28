package leetcode;

import java.util.PriorityQueue;

public class LC1337_The_K_Weakest_Rows_in_a_Matrix_X {
	public int[] kWeakestRows(int[][] mat, int k) {
		int[] ans = new int[k];
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int i = 0; i < mat.length; i++) {
			pq.add(new Pair(countSoldiers(mat[i]), i));
		}
		for (int i = 0; i < k; i++) {
			ans[i] = pq.remove().idx;
		}
		return ans;
	}

	public class Pair implements Comparable<Pair> {
		int count;
		int idx;

		Pair(int count, int idx) {
			this.count = count;
			this.idx = idx;
		}

		public int compareTo(Pair o) {
			if (this.count != o.count) {
				return this.count - o.count;
			} else {
				return this.idx - o.idx;
			}
		}
	}

	public int countSoldiers(int[] row) {
		int count = 0;
		for (int i = 0; i < row.length; i++) {
			if (row[i] == 0) {
				break;
			}
			count++;
		}
		return count;
	}
}
