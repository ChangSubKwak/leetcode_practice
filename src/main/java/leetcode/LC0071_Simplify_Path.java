package leetcode;

import java.util.LinkedList;

public class LC0071_Simplify_Path {
    public String simplifyPath(String path) {
    	LinkedList<String> ll = new LinkedList<>();
    	String[] newPath = path.split("\\/+");
    	
    	for (int i = 0 ; i < newPath.length ; i++) {
    		if (newPath[i].equals("")) {
    			continue;
    		}
    		
    		if (newPath[i].equals(".")) {
    			continue;
    		}
    		
    		if (newPath[i].equals("..")) {
    			if (ll.size() > 0) {
    				ll.pollLast();
    			}
    			continue;
    		}
    		
    		ll.add(newPath[i]);
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append("/");
    	for (int i = 0 ; i < ll.size() ; i++) {
    		sb.append(ll.get(i));
    		if ( i+1 < ll.size()) {
    			sb.append("/");
    		}
    	}
        return sb.toString();
    }
}
