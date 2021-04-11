package leetcode;

public class LC0117_PopulatingNextRightPointersinEachNodeII_X {
    public Node connect(Node root) {
    	Node node  = root;
    	Node levelHead  = new Node(0);
    	
    	while (node != null) {
    		Node needle = levelHead;
    		
    		while (node != null) {
    			// left child
    			if (node.left != null) {
    				needle.next = node.left;
    				needle = needle.next;
    			}
    			// right child
    			if (node.right != null) {
    				needle.next = node.right;
    				needle = needle.next;
    			}
    			node = node.next;
    		}
    		
    		node = levelHead.next;
    		levelHead.next = null;
    	}

    	return root;
    }
	
	public static void main(String[] args) {
		LC0117_PopulatingNextRightPointersinEachNodeII_X t = new LC0117_PopulatingNextRightPointersinEachNodeII_X();
//		Node root = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(3);
//		root.left = n2;
//		root.right = n3;
//		
//		Node n4 = new Node(4);
//		Node n5 = new Node(5);
//		n2.left = n4;
//		n2.right = n5;
//		
//		Node n6 = new Node(6);
//		Node n7 = new Node(7);
//		n3.right = n7;
		
//		Node root = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(3);
//		root.left = n2;
//		root.right = n3;
//		
//		Node n4 = new Node(4);
//		Node n5 = new Node(5);
//		n2.left = n4;
//		n3.right = n5;
		
//		Node root = new Node(3);
//		Node n9  = new Node(9);
//		Node n20 = new Node(20);
//		root.left = n9;
//		root.right = n20;
//		
//		Node n15 = new Node(15);
//		Node n7  = new Node(7);
//		n20.left  = n15;
//		n20.right = n7;
		
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
		//n3.left  = n6;
		n3.right = n6;
		
		Node n7 = new Node(7);
		n4.left = n7;
		
		Node n8 = new Node(8);
		n6.right = n8;
		
		System.out.println(t.connect(root).constructLevelList());
	}
}
