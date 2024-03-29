package leetcode;

import java.util.HashMap;

public class LC0981_Time_Based_Key_Value_Store {
    static class TimeMap {
        private HashMap<String, HashMap<Integer, String>> keyTimeMap;
        public TimeMap() {
            keyTimeMap = new HashMap<String, HashMap<Integer, String>>();
        }

        public void set(String key, String value, int timestamp) {
            if (!keyTimeMap.containsKey(key)) {
                keyTimeMap.put(key, new HashMap<Integer, String>());
            }

            keyTimeMap.get(key).put(timestamp, value);
        }

        public String get(String key, int timestamp) {
            if (!keyTimeMap.containsKey(key)) {
                return "";
            }

            for (int currTime = timestamp; currTime >= 1; --currTime) {
                if (keyTimeMap.get(key).containsKey(currTime)) {
                    return keyTimeMap.get(key).get(currTime);
                }
            }

            return "";
        }
    }
}
