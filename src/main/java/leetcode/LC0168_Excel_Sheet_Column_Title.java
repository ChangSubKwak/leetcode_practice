package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0168_Excel_Sheet_Column_Title {
    public String convertToTitle(int columnNumber) {
        List<String> list = new ArrayList<>();
        
        while(columnNumber != 0) {
            int num1 = columnNumber / 26;
            int num2 = columnNumber % 26;
            columnNumber = num1;
            
            char c = (char)('A' + num2 - 1);
            
            list.add(String.valueOf(c));
        }
        
        System.out.println(list);
        
        return String.join("", list);
    }
}
