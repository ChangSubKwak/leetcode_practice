package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LC0451_SortCharactersByFrequency {
	public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                continue;
            }
            map.put(s.charAt(i), 1);
        }


        // 정렬하기
        List<Entry<Character, Integer>> list_entries = new ArrayList<Entry<Character, Integer>>(map.entrySet());

		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<Character, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<Character, Integer> obj1, Entry<Character, Integer> obj2) {
				// 오름 차순 정렬
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});

		// 결과 출력
        StringBuilder sb = new StringBuilder();
		for(Entry<Character, Integer> entry : list_entries) {
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
// 			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

        return sb.toString();
    }
}
