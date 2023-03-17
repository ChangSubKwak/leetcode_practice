package leetcode;

public class LC0208_Implement_Trie {

    private static class Node {
        Node[] child = new Node[26];
        boolean isTerminal = false;
        int childNum = 0;
        char val;
    }
    public static class Trie {
        private Node root;

        private int charToInt(char c){
            return c - 'a';
        }

        public Trie() {
            this.root = new Node();
            this.root.val = ' ';
        }

        public void insert(String word) {
            int length = word.length();
            Node current = this.root;
            for (int i = 0; i < length; i++) {
                char c = word.charAt(i);
                int num = this.charToInt(c);

                if (current.child[num] == null) {
                    current.child[num] = new Node();
                    current.child[num].val = c;
                    current.childNum++;
                }

                current = current.child[num];
            }
            current.isTerminal = true;
        }

        public boolean search(String word) {
            int length = word.length();
            Node current = this.root;

            for (int i = 0; i < length; i++) {
            	char c = word.charAt(i);
                int num = this.charToInt(c);
                if (current.child[num] == null) {
                	return false;
                }
                current = current.child[num];
            }
            return current != null && current.isTerminal;
        }

        public boolean startWith(String prefix) {
            int length = prefix.length();
            Node current = this.root;

            for (int i = 0; i < length; i++) {
            	char c = prefix.charAt(i);
                int num = this.charToInt(c);
                if (current.child[num] == null) {
                	return false;
                }
                current = current.child[num];
            }

            return true;
        }
    }
}
