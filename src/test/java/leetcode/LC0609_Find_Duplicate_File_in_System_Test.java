package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0609_Find_Duplicate_File_in_System_Test {
	LC0609_Find_Duplicate_File_in_System test;
	
	@BeforeEach
	void setUp() {
		test = new LC0609_Find_Duplicate_File_in_System();
	}
	
	@Test
	void test() {
		String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
		assertThat(test.findDuplicate(paths)).isEqualTo(Arrays.asList(
			Arrays.asList("root/a/2.txt","root/c/d/4.txt","root/4.txt"),
			Arrays.asList("root/a/1.txt","root/c/3.txt")
		));

		paths = new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"};
		assertThat(test.findDuplicate(paths)).isEqualTo(Arrays.asList(
			Arrays.asList("root/a/2.txt","root/c/d/4.txt"),
			Arrays.asList("root/a/1.txt","root/c/3.txt")
		));
	}
}
