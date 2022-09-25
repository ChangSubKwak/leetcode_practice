package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0622_Design_Circular_Queue_Test {
	@Test
	void test() {
		LC0622_Design_Circular_Queue.MyCircularQueue myCircularQueue = new LC0622_Design_Circular_Queue.MyCircularQueue(3);
		assertThat(myCircularQueue.enQueue(1)).isTrue();
		assertThat(myCircularQueue.enQueue(2)).isTrue();
		assertThat(myCircularQueue.enQueue(3)).isTrue();
		assertThat(myCircularQueue.enQueue(4)).isFalse();
		assertThat(myCircularQueue.Rear()).isEqualTo(3);
		assertThat(myCircularQueue.isFull()).isTrue();
		assertThat(myCircularQueue.deQueue()).isTrue();
		assertThat(myCircularQueue.enQueue(4)).isTrue();
		assertThat(myCircularQueue.Rear()).isEqualTo(4);
	}
}
