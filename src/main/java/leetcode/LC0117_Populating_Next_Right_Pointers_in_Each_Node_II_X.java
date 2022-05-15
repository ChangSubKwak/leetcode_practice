package leetcode;

public class LC0117_Populating_Next_Right_Pointers_in_Each_Node_II_X {
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
}
