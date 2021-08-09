package leetcode;

public class LC0415_AddStrings {
    public String addStrings(String num1, String num2) {
    	StringBuilder sb = new StringBuilder();
    	
    	if (num1.length() > num2.length()) {
    		String temp = new String(num1);
    		num1 = num2;
    		num2 = temp;
    	}
    	
    	int i = num1.length() - 1;
    	int j = num2.length() - 1;
    	int carry = 0; 
    	while(j >= 0) {
    		int number1 = 0;
    		if (i >= 0) {
    			number1 = num1.charAt(i) - '0';
    			i--;
    		}

    		int number2 = 0;
    		if (j >= 0) {
    			number2 = num2.charAt(j) - '0';
    			j--;
    		}
    		
    		int number3 = number1 + number2 + carry;
    		carry = 0;
    		if (number3 >= 10) {
    			carry = 1;
    		}
    		
    		sb.insert(0, String.valueOf(number3 % 10));
    	}
    	
    	if (carry >= 1) {
    		sb.insert(0, "1");
    	}
    	
        return sb.toString();
    }
    
	public static void main(String[] args) {
		LC0415_AddStrings t = new LC0415_AddStrings();
		System.out.println(t.addStrings("11", "123"));
		System.out.println(t.addStrings("456", "777"));
		System.out.println(t.addStrings("5", "9"));
	}
}
