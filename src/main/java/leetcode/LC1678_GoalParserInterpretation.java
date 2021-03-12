package main.java.leetcode;

public class LC1678_GoalParserInterpretation {
    public String interpret(String command) {
    	int len = command.length();
    	
    	StringBuilder sb = new StringBuilder();
    	int i = 0;
    	while(i < len) {
    		if (command.charAt(i)=='G') {
    			sb.append("G");
    			i++;
    			continue;
    		}
    		
    		if (i < len - 1 && command.charAt(i)=='(' && command.charAt(i+1)==')') {
    			sb.append("o");
    			i+=2;
    			continue;
    		}
    		
    		if (i < len - 3 && command.substring(i, i+4).equals("(al)")) {
    			sb.append("al");
    			i+=4;
    			continue;
    		}
    	}
    	return sb.toString();
    }
	
	public static void main(String[] args) {
		LC1678_GoalParserInterpretation t = new LC1678_GoalParserInterpretation();
		System.out.println(t.interpret("G()(al)"));
		System.out.println(t.interpret("G()()()()(al)"));
		System.out.println(t.interpret("(al)G(al)()()G"));
	}
}
