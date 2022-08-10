package leetcode;

public class LC0108_Convert_Sorted_Array_to_Binary_Search_Tree {
    private TreeNode cutBinary(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        
        int middle = start + (end - start) / 2;
        
        TreeNode node = new TreeNode(nums[middle]);
        node.left  = cutBinary(nums, start, middle - 1);
        node.right = cutBinary(nums, middle + 1, end);
        
        return node;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        return cutBinary(nums, 0, nums.length - 1);
    }
}
