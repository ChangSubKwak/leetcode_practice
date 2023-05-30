package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC0705_Design_HashSet {
	static class MyHashSet {
		private int HASH_SIZE = 1000_000 / 32 + 1;
    	private int[] values;

		public MyHashSet() {
			values = new int[HASH_SIZE];
		}

		public void add(int key) {
			int arrayIndex = (key / 32);
			int indexBit = 1 << (key % 32);
			values[arrayIndex] |= indexBit;
		}

		public void remove(int key) {
			int arrayIndex = (key / 32);
			int indexBit = 1 << (key % 32);
			values[arrayIndex] &= (~indexBit);
		}

		public boolean contains(int key) {
			int arrayIndex = (key / 32);
			int indexBit = 1 << (key % 32);
			if ((values[arrayIndex] & indexBit) != 0x00) {
				return true;
			}
			return false;
		}
	}
}
