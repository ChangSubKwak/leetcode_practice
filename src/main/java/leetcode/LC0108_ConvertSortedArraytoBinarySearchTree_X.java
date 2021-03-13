package leetcode;

public class LC0108_ConvertSortedArraytoBinarySearchTree_X {
	public TreeNode constructBST(int[] nums, int l, int r) {
		if (l > r) return null;
		
		int m = l + (r - l) / 2;
		
		TreeNode n = new TreeNode(nums[m]);
		n.left  = constructBST(nums, l, m - 1);
		n.right = constructBST(nums, m + 1, r);
		return n;
	}
	
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructBST(nums, 0, nums.length - 1);
    }
	
	public static void main(String[] args) {
		LC0108_ConvertSortedArraytoBinarySearchTree_X t = new LC0108_ConvertSortedArraytoBinarySearchTree_X();
		System.out.println(t.sortedArrayToBST(new int[] {-10,-3,0,5,9}).constructLevelList());
	}
}
