package leetcode;

public class LC0055_JumpGame {
    public boolean canJump(int[] nums) {
    	int curPos = 0, curFarthest = 0;
    	for (int i = 0 ; i < nums.length - 1 ; i++ ) {
    		curFarthest = Math.max(curFarthest, i + nums[i]);
    		if (i == curPos) {
    			curPos = curFarthest;
    		}
    	}
    	
    	//System.out.println(curPos);
    	
    	return curPos >= nums.length - 1;
    }
	
	public static void main(String[] args) {
		LC0055_JumpGame t = new LC0055_JumpGame();
//		System.out.println(t.canJump(new int[] {2,3,1,1,4}));
//		System.out.println(t.canJump(new int[] {3,2,1,0,4}));
		System.out.println(t.canJump(new int[] {2,0}));
	}
}
