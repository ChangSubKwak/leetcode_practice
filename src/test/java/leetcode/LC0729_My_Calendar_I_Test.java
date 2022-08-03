package leetcode;

import leetcode.LC0729_My_Calendar_I.MyCalendar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0729_My_Calendar_I_Test {
	MyCalendar test;
	
	@BeforeEach
	void setUp() {
		test = new MyCalendar();
	}
	
	@Test
	void test() {
		assertThat(test.book(10, 20)).isEqualTo(true);
		assertThat(test.book(15, 25)).isEqualTo(false);
		assertThat(test.book(20, 30)).isEqualTo(true);
	}
}
