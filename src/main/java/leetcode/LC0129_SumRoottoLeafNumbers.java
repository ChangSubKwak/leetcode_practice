package leetcode;

public class LC0129_SumRoottoLeafNumbers {
    int sum = 0;
    
    public int sumNumbers(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        traverse(root, sb);
        return sum;
    }
    
    public void traverse(TreeNode root, StringBuilder sb) {
        if (root == null) {
            return;
        }
        
        if (root.left == null && root.right == null) {
            sb.append(root.val);
            sum += Integer.valueOf(sb.toString());
            sb.setLength(sb.length() - 1);
            return;
        }
        sb.append(root.val);
        traverse(root.left, sb);
        traverse(root.right, sb);
        sb.setLength(sb.length() - 1);
    }
	
	public static void main(String[] args) {
		LC0129_SumRoottoLeafNumbers t = new LC0129_SumRoottoLeafNumbers();
		TreeNode tn = new TreeNode(1);
		tn.left = new TreeNode(2);
		tn.right = new TreeNode(3);
		
		System.out.println(t.sumNumbers(tn));
	}
}
