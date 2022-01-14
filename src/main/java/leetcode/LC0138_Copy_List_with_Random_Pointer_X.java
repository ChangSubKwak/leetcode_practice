package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0138_Copy_List_with_Random_Pointer_X {
	class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	}
	
    Map<Node,Node> visited = new HashMap<>();
    private Node getClonedNode(Node n) {
        if(n==null)
            return null;
        if(visited.containsKey(n)) {
            return visited.get(n);
        }else {
            visited.put(n, new Node(n.val));
            return visited.get(n);
        }
    }
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Node oldNode = head;
        Node newNode= new Node(oldNode.val);
        visited.put(oldNode,newNode);
        while(oldNode!=null) {
            newNode.next= getClonedNode(oldNode.next);
            newNode.random= getClonedNode(oldNode.random);
            
            newNode=newNode.next;
            oldNode=oldNode.next;
        }
        return visited.get(head);
    }
}
