package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0706_Design_HashMap {
	static class ListNode {
	    int key, value;
	    ListNode next;
	    public ListNode(int key, int value, ListNode next) {
	        this.key = key;
	        this.value = value;
	        this.next = next;
	    }
	}

	static class MyHashMap {
		static final int size = 19997;
		static final int multiplier = 12582917;

		ListNode[] data;

		public MyHashMap() {
			this.data = new ListNode[size];
		}

		private int hash(int key) {
			return (int) ((long) key * multiplier % size);
		}

		public void put(int key, int value) {
			remove(key);
			int hashValue = hash(key);
			ListNode node = new ListNode(key, value, data[hashValue]);
			data[hashValue] = node;
		}

		public int get(int key) {
			int hashValue = hash(key);
			ListNode node = data[hashValue];
			while (node != null) {
				if (node.key == key) {
					return node.value;
				}
				node = node.next;
			}
			return -1;
		}

		public void remove(int key) {
			int hashValue = hash(key);
			ListNode node = data[hashValue];

			if (node == null) {
				return;
			}

			if (node.key == key) {
				data[hashValue] = node.next;
				return;
			}

			while (node.next != null) {
				if (node.next.key == key) {
					node.next = node.next.next;
					return;
				}
				node = node.next;
			}
		}
	}
}
