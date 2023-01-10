package leetcode;

public class LC0100_SameTree {
    public boolean isSameTree1(TreeNode p, TreeNode q) {
    	if (p == null && q == null)
    		return true;
    	
    	if (p == null && q != null)
    		return false;
    	
    	if (p != null && q == null)
    		return false;
    	
    	if (!isSameTree1(p.left, q.left)) return false;
    	if (p.val != q.val)
    		return false;
    	if (!isSameTree1(p.right, q.right)) return false;
        
    	return true;
    }
}
