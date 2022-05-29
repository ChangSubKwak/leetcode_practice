package leetcode;

public class LC0318_Maximum_Product_of_Word_Lengths_X {
    public int maxProduct(String[] words) {
        if (words == null || words.length == 0) {
            return 0;    
        }
            
		int len = words.length;
        int[] bitSet = new int[len];
        
        for (int i = 0; i < len; i++) {
            String word = words[i];
            bitSet[i] = 0;
            
            for (int j = 0; j < word.length(); j++) {
			    bitSet[i] |= 1 << (word.charAt(j) - 'a');
            }
		}
    	
        int maxProduct = 0;
        for (int i = 0; i < len; i++) {
		    for (int j = i + 1; j < len; j++) {
			    if ((bitSet[i] & bitSet[j]) == 0 && (words[i].length() * words[j].length() > maxProduct)) {
                    maxProduct = words[i].length() * words[j].length();
                }
            }
		}
	    return maxProduct;
    }
}
