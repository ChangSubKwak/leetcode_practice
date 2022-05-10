package leetcode;

public class LC0168_Excel_Sheet_Column_Title {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
        while(columnNumber > 26) {
            columnNumber--;
            int remain = (columnNumber % 26);
            columnNumber /= 26;
            
            char c = (char)('A' + remain);
            sb.append(c);
        }
        
        sb.append((char)('A' + columnNumber - 1));
        sb.reverse();
        
        return sb.toString();
    }
}
