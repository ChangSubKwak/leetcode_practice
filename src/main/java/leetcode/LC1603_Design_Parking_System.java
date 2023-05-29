package leetcode;

public class LC1603_Design_Parking_System {
    static class ParkingSystem {
        private int[] size;

        public ParkingSystem(int big, int medium, int small) {
            this.size = new int[] {big, medium, small};
        }

        public boolean addCar(int carType) {
            if (size[carType - 1] > 0) {
                size[carType - 1]--;
                return true;
            }
            return false;
        }
    }
}
