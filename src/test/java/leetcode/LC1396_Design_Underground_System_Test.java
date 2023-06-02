package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1396_Design_Underground_System_Test {
    @Test
    void test() {
        LC1396_Design_Underground_System.UndergroundSystem test = new LC1396_Design_Underground_System.UndergroundSystem();
        test.checkIn(45, "Leyton", 3);
        test.checkIn(32, "Paradise", 8);
        test.checkIn(27, "Leyton", 10);
    }
}
