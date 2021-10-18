package leetcode;

import java.util.ArrayList;
import java.util.List;

// Check if Numbers Are Ascending in a Sentence
public class LC2043_SimpleBankSystem {
    public boolean areNumbersAscending(String s) {
    	String[] array = s.split(" ");
    	List<Integer> list = new ArrayList<>();
    	for (int i = 0; i < array.length; i++) {
    		if (array[i].matches("\\d+") && array[i].charAt(0) != '0') {
    			list.add(Integer.valueOf(array[i]));
    			int size = list.size();
    			if (size > 1 && list.get(size - 2) >= list.get(size - 1)) {
    				return false;
    			}
    		}
    	}
    	
    	return true;
    }
	

	public static void main(String[] args) {
		LC2043_SimpleBankSystem t = new LC2043_SimpleBankSystem();
		System.out.println(t.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
		System.out.println(t.areNumbersAscending("hello world 5 x 5"));
		System.out.println(t.areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
		System.out.println(t.areNumbersAscending("4 5 11 26"));
	}
}
