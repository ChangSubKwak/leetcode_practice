package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0726_Number_of_Atoms_Test {
	@Test
	void test() {
		LC0726_Number_of_Atoms test = new LC0726_Number_of_Atoms();

		assertThat(test.countOfAtoms("H2O")).isEqualTo("H2O");
		assertThat(test.countOfAtoms("Mg(OH)2")).isEqualTo("H2MgO2");
		assertThat(test.countOfAtoms("K4(ON(SO3)2)2")).isEqualTo("");
	}
}
