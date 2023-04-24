package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LC0071_Simplify_Path {
	public String simplifyPath(String path) {
		List<String> pathNames = Arrays.stream(path.split("/"))
			.filter(e -> !e.equals(""))
			.filter(e -> !e.equals("."))
			.collect(Collectors.toList());

     	List<String> simplified = new ArrayList<>();
		 for (String name : pathNames) {
			 if (name.equals("..") && simplified.size() > 0) {
				 simplified.remove(simplified.size() - 1);
				 continue;
			 }
			 simplified.add(name);
		 }
		 return "/" + String.join("/", simplified);
 	}
    public String simplifyPath_V1(String path) {
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
