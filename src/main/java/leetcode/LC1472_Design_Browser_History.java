package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC1472_Design_Browser_History {
    public static class BrowserHistory {
        private List<String> history;
        private int index;

        public BrowserHistory(String homepage) {
            history = new ArrayList<>();
            history.add(homepage);
            index = 0;
        }

        public void visit(String url) {
            // clears up all the forward history
            history = history.subList(0, index + 1);
            history.add(url);
            index = history.size() - 1;
        }

        public String back(int steps) {
            index = Math.max(index - steps, 0);
            return history.get(index);
        }

        public String forward(int steps) {
            index = Math.min(index + steps, history.size() - 1);
            return history.get(index);
        }
    }
}
