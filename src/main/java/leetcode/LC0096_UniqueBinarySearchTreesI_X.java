package main.java.leetcode;

public class LC0096_UniqueBinarySearchTreesI_X {
	public int numTrees(int n) {
		int[] G = new int[n+1];
		G[0] = G[1] = 1;
		for (int i = 2 ; i <= n ; i++) {
			for (int j = 1 ; j <= i ; j++) {
				G[i] += G[j-1] * G[i-j];
			}
		}
		
		return G[n];
    }
	
	public static void main(String[] args) {
		LC0096_UniqueBinarySearchTreesI_X t = new LC0096_UniqueBinarySearchTreesI_X();
		System.out.println(t.numTrees(5));
	}
}
