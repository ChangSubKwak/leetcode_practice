package leetcode;

import java.util.PriorityQueue;

public class LC1845_Seat_Reservation_Manager {
    static class SeatManager {
        private final PriorityQueue<Integer> pq;
        
        public SeatManager(int n) {
            pq = new PriorityQueue<>();
            for (int i = 1; i <= 5; i++) {
                pq.add(i);
            }
        }
        
        public int reserve() {
            return pq.poll();
        }
        
        public void unreserve(int seatNumber) {
            pq.add(seatNumber);
        }
    }
}
