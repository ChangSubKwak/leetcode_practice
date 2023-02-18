package leetcode;

public class LC0067_Add_Binary {
    public String addBinary(String a, String b) {
        StringBuilder sa = new StringBuilder(a);
        StringBuilder sb = new StringBuilder(b);

        if (sa.length() < sb.length()) {
            String temp = sa.toString();
            sa = sb;
            sb = new StringBuilder(temp);
        }

        sa.reverse();
        sb.reverse();

        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            int num1 = Integer.valueOf(sa.charAt(i) - '0');
            int num2 = Integer.valueOf(sb.charAt(i) - '0');
            if (num1 + num2 + carry >= 2) {
                result.append((num1 + num2 + carry) % 2);
                carry = 1;
                continue;
            }
            result.append(num1 + num2 + carry);
            carry = 0;
        }

        for (int i = sb.length(); i < sa.length(); i++) {
            int num1 = Integer.valueOf(sa.charAt(i) - '0');
            if (num1 + carry >= 2) {
                result.append((num1 + carry) % 2);
                carry = 1;
                continue;
            }

                result.append(num1 + carry);
            carry = 0;
        }

        if (carry > 0) {
            result.append(carry);
        }

        result.reverse();
        return result.toString();
    }

    public String addBinaryV1(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int aLen = a.length();
        int bLen = b.length();
        
        if (aLen < bLen) {
            String temp = a;
            a = b;
            b = temp;
            
            int tempLen = aLen;
            aLen = bLen;
            bLen = tempLen;
        }
        
        int carry = 0;
        for (int i = aLen - 1, j = bLen - 1; i >= 0; i--, j--) {
            int value = (a.charAt(i) - '0') + (j >= 0 ? (b.charAt(j) - '0') : 0);
            value += carry;
            carry = value >= 2 ? 1 : 0;
            value %= 2;
            
            sb.insert(0, value);
        }
        
        if (carry == 1) {
            sb.insert(0, "1");
        }
        
        return sb.toString();
    }

}
