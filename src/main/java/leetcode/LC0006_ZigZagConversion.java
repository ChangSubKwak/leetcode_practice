package main.java.leetcode;

public class LC0006_ZigZagConversion {
    public String convert(String s, int numRows) {
    	if (numRows < 2 || s.length() <= numRows)
    		return s;
    	
    	StringBuilder[] sb = new StringBuilder[numRows];
    	for (int i = 0 ; i < numRows ; i++)
    		sb[i] = new StringBuilder();
    	
    	int row = 0, col = 0;
    	int i = 0, j = 0;
    	while (true) {
    		row = (i + j)%numRows;
    		col = (i + j)/numRows;
    		
    		if (col % (numRows - 1) == 0 ) {
    			sb[row].append(s.charAt(i));
    			i++;
    		}
    		else {
    			if ( (row+col)%(numRows-1) == 0) {
    				sb[row].append(s.charAt(i));
    				i++;
    			}
    			else {
    				sb[row].append(' ');
    				j++;
    			}
    		}
    		
    		if (i >= s.length())
    			break;
    	}
    	
    	StringBuilder res = new StringBuilder();
    	for (i = 0 ; i < sb.length ; i++)
    		res.append(sb[i].toString().replaceAll(" ", ""));
        return res.toString();
    }
	
	public static void main(String[] args) {
		LC0006_ZigZagConversion lc = new LC0006_ZigZagConversion();
		System.out.println(lc.convert("", 1));
		System.out.println(lc.convert("A", 1));
		System.out.println(lc.convert("AB", 1));
		System.out.println(lc.convert("ABCABC", 2));
		System.out.println(lc.convert("PAYPALISHIRING", 3));
		System.out.println(lc.convert("PAYPALISHIRING", 4));
	}
}
