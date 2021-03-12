package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0068_TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
    	List<String> res = new ArrayList<String>();

    	int i = 0;
    	StringBuilder sb = new StringBuilder();
    	while(i < words.length) {
	    	sb.setLength(0);
	    	
	    	int spaceNum = 0;
	    	while(i < words.length) {
	    		if (sb.length() + words[i].length() > maxWidth) break;
	    		sb.append(words[i]);
	    		sb.append(" ");
	    		i++;
	    		spaceNum++;
	    	}
	    	spaceNum--;
	    	sb.setLength(sb.length() - 1);
	    	
	    	if (spaceNum > 0 && i < words.length ) {
		    	int addSpaceNum = (maxWidth - sb.length()) / spaceNum;
		    	int remainSpaceNum = (maxWidth - sb.length()) % spaceNum;
		    	
		    	int j = 0;
		    	while(spaceNum > 0 && sb.length() < maxWidth) {
		    		if (sb.charAt(j) == ' ' && spaceNum > 0) {
		    			for (int k = 0 ; k < addSpaceNum ; k++) {
		    				sb.insert(j, " ");
		    			}
		    			j += addSpaceNum;
		    			if (remainSpaceNum > 0) {
		    				sb.insert(j, " ");
		    				remainSpaceNum--;
		    				j++;
		    			}
		    			spaceNum--;
		    		}
		    		j++;
		    	}
	    	}
	    	else {
	    		int addSpaceNum = (maxWidth - sb.length());
	    		for(int j = 0 ; j < addSpaceNum ; j++)
	    			sb.append(" ");
	    	}
	    	//System.out.println("[" + sb.toString() + "]");
	    	res.add(sb.toString());
    	}
    	
        return res;
    }
    
	public static void main(String[] args) {
		LC0068_TextJustification t = new LC0068_TextJustification();
		List<String> res = t.fullJustify(new String[] {"This", "is", "an", "example", "of", "text", "justification."}, 16);
		//List<String> res = t.fullJustify(new String[] {"What","must","be","acknowledgment","shall","be"}, 16);
		//List<String> res = t.fullJustify(new String[] {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"}, 20);
		for (int i = 0 ; i < res.size() ; i++)
			System.out.println("[" + res.get(i) + "]");
	}
}
