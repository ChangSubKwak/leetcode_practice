package leetcode;

public class LC0100_Same_Tree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q != null) {
		 return false;
		}

		if (p != null && q == null) {
		 return false;
		}

		if (p == null && q == null) {
		 return true;
		}

		if (p.val != q.val) {
		 return false;
		}

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	 }

    public boolean isSameTreeV1(TreeNode p, TreeNode q) {
    	if (p == null && q == null)
    		return true;
    	
    	if (p == null && q != null)
    		return false;
    	
    	if (p != null && q == null)
    		return false;
    	
    	if (!isSameTreeV1(p.left, q.left)) return false;
    	if (p.val != q.val)
    		return false;
    	if (!isSameTreeV1(p.right, q.right)) return false;
        
    	return true;
    }
}
