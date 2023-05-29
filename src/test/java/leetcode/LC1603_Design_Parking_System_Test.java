package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LC1603_Design_Parking_System_Test {
    @Test
    void test() {
        LC1603_Design_Parking_System.ParkingSystem test = new LC1603_Design_Parking_System.ParkingSystem(1, 1, 0);
        assertThat(test.addCar(1)).isTrue();
        assertThat(test.addCar(2)).isTrue();
        assertThat(test.addCar(3)).isFalse();
        assertThat(test.addCar(1)).isFalse();
    }
}
