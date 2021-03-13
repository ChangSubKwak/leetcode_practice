package leetcode;

public class LC0100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if (p == null && q == null)
    		return true;
    	
    	if (p == null && q != null)
    		return false;
    	
    	if (p != null && q == null)
    		return false;
    	
    	if (!isSameTree(p.left, q.left)) return false;
    	if (p.val != q.val)
    		return false;
    	if (!isSameTree(p.right, q.right)) return false;
        
    	return true;
    }
	
	public static void main(String[] args) {
		LC0100_SameTree t = new LC0100_SameTree();
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn1 = new TreeNode(1, tn2, tn3);
		
		TreeNode atn2 = new TreeNode(2);
		TreeNode atn3 = new TreeNode(3);
		TreeNode atn1 = new TreeNode(1, atn2, atn3);
		System.out.println(t.isSameTree(tn1, atn1));
		
//		TreeNode tn2 = new TreeNode(2);
//		TreeNode tn1 = new TreeNode(1, tn2, null);
//		
//		TreeNode atn2 = new TreeNode(2);
//		TreeNode atn1 = new TreeNode(1, null, atn2);
//		System.out.println(t.isSameTree(tn1, atn1));
	}
}
