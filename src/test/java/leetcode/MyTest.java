package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class MyTest {
    // https://dzone.com/articles/what-exactly-is-mccabe-cyclomatic-complexity#:~:text=The%20cyclomatic%20complexity%20is%20a%20measurement%20of%20the,to%20an%20over-reliance%20on%20branches%2C%20switch%2Fcases%20or%20loops.
    @DisplayName("if문 이용 경로수 체크")
    @Test
    void test1() {
        if (1 == 0) {
            System.out.println("i == 0");
        }

        if (1 == 0 && 2 == 0) {
            System.out.println("i == 0");
        }
    }

    @DisplayName("if문 이용 경로수 체크")
    @Test
    void test2() {
        if (1 == 0 && 1 > 0) {
            System.out.println("i == 0");
        }
    }

    static class A {
        public void func() {}
    }

    static class B extends A {
        @Override
        public void func() {

        }
    }

    static class C extends B {
        @Override
        public void func() {

        }
    }

}
