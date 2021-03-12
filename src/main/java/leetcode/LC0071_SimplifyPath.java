package main.java.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class LC0071_SimplifyPath {
    public String simplifyPath(String path) {
    	LinkedList<String> ll = new LinkedList<>();
    	String[] newPath = path.split("\\/+");
    	
    	System.out.println(Arrays.toString(newPath));
    	
    	for (int i = 0 ; i < newPath.length ; i++) {
    		if (newPath[i].equals("")) continue;
    		if (newPath[i].equals(".")) continue;
    		if (newPath[i].equals("..")) {
    			if (ll.size() > 0) ll.pollLast();
    			continue;
    		}
    		ll.add(newPath[i]);
    	}
    	
    	System.out.println(ll);
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append("/");
    	for (int i = 0 ; i < ll.size() ; i++) {
    		sb.append(ll.get(i));
    		if ( i+1 < ll.size())
    			sb.append("/");
    	}
        return sb.toString();
    }
    
	public static void main(String[] args) {
		LC0071_SimplifyPath t = new LC0071_SimplifyPath();
		System.out.println(t.simplifyPath("/a//b////c/d//././/.."));
//		System.out.println(t.simplifyPath("/home/"));
//		System.out.println(t.simplifyPath("/../"));
//		System.out.println(t.simplifyPath("/home//foo/"));
//		System.out.println(t.simplifyPath("/a/./b/../../c/"));
	}
}
