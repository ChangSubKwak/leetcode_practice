package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0509_Fibonacci_Number_Test {
	LC0509_Fibonacci_Number test;
	
	@BeforeEach
	void setUp() {
		test = new LC0509_Fibonacci_Number();
	}
	
	@Test
	void test() {
		assertThat(test.fib(2)).isEqualTo(1);
		assertThat(test.fib(3)).isEqualTo(2);
		assertThat(test.fib(4)).isEqualTo(3);
		assertThat(test.fib(5)).isEqualTo(5);
	}
}
