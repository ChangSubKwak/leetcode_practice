package leetcode;

import java.util.*;

public class LC0020_ValidParentheses {
    public boolean isValid(String s) {
    	if (s.length() < 2) return false;
    	
        List<String> open = new ArrayList<>();
        open.add("(");	open.add("{");  open.add("[");
        
        List<String> close = new ArrayList<>();
        close.add(")");	close.add("}");  close.add("]");
        
        if (!open.contains(s.charAt(0)+""))
        	return false;
        
        List<String> cur = new ArrayList<>();
        for (int i = 0 ; i < s.length() ; i++) {
        	if (cur.size() == 0 && close.contains(s.charAt(i) + ""))
        		return false;
        	
        	if (open.contains(s.charAt(i)+"")) {
        		cur.add(s.charAt(i)+"");
        	} else {
        		String last = cur.get(cur.size() - 1);
        		if (last.equals("(") && s.charAt(i) != ')' ) return false;
        		else if (last.equals("{") && s.charAt(i) != '}' ) return false;
        		else if (last.equals("[") && s.charAt(i) != ']' ) return false;
        		else {
        			cur.remove(cur.size() - 1);
        		}
        	}
        }
        
        if (cur.size() == 0) return true;
        
    	return false;
    }
	
	public static void main(String[] args) {
		LC0020_ValidParentheses lc = new LC0020_ValidParentheses();
		
		System.out.println(lc.isValid("(){}}{"));
		System.out.println(lc.isValid("){"));
		System.out.println(lc.isValid("()"));
		System.out.println(lc.isValid("()[]{}"));
		System.out.println(lc.isValid("(]"));
		System.out.println(lc.isValid("([)]"));
		System.out.println(lc.isValid("{[]}"));
		
		

	}
}
