package leetcode;

// O(n^2)
public class LC0005_LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
        int length = s.length();
        String res = "";
    
        boolean[][] isPalindrome = new boolean[length][length];   // 첫번째 인덱스 : 문자열 시작 인덱스
                                                                  // 두번째 인덱스 : 문자열 종료 인덱스
                                                                  // Palindrome이냐를 판단하는 데이터를 동적으로 저장하는 배열
        int max = -1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                boolean isMatch = s.charAt(j) == s.charAt(i);
                isPalindrome[j][i] = (i - j <= 1) ? isMatch : (isMatch && isPalindrome[j + 1][i - 1]);
                
                if (isPalindrome[j][i] && (i - j + 1 > max)) {
                    max = i - j + 1;
                    res = s.substring(j, i + 1);
                }
            }
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		LC0005_LongestPalindromicSubstring lc = new LC0005_LongestPalindromicSubstring();
		System.out.println(lc.longestPalindrome("zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir"));
		System.out.println(lc.longestPalindrome("bb"));
		System.out.println(lc.longestPalindrome("cbbd"));
		System.out.println(lc.longestPalindrome("babad"));
	}
}
