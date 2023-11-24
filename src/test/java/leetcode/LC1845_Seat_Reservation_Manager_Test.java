package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1845_Seat_Reservation_Manager_Test {

    @Test
    void test() {
        LC1845_Seat_Reservation_Manager.SeatManager test = new LC1845_Seat_Reservation_Manager.SeatManager(5);

        assertThat(test.reserve()).isEqualTo(1);
        assertThat(test.reserve()).isEqualTo(2);
        test.unreserve(2);
        assertThat(test.reserve()).isEqualTo(2);
        assertThat(test.reserve()).isEqualTo(3);
        assertThat(test.reserve()).isEqualTo(4);
        assertThat(test.reserve()).isEqualTo(5);
        test.unreserve(5);
    }
}
