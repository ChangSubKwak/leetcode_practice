package leetcode;

public class LC0116_PopulatingNextRightPointersinEachNode_X {
    public Node connect(Node root) {
    	if (root == null)
    		return null;
    	
    	Node pre = root;
    	Node cur = null;

    	while(pre.left != null) {
    		cur = pre;
    		while(cur != null) {
    			cur.left.next = cur.right;
    			if (cur.next != null)
    				cur.right.next = cur.next.left;
    			cur = cur.next;
    		}
    		pre = pre.left;
    	}
    	
    	return root;
    }
	
	public static void main(String[] args) {
		LC0116_PopulatingNextRightPointersinEachNode_X t = new LC0116_PopulatingNextRightPointersinEachNode_X();
		Node root = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		root.left = n2;
		root.right = n3;
		
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n2.left = n4;
		n2.right = n5;
		
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		n3.left  = n6;
		n3.right = n7;
		
		System.out.println(t.connect(root).constructLevelList());
	}
}
