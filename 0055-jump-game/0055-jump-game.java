class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = nums[0];

        for (int i = 1; i < n; i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(i + nums[i], maxReach);
        }
        return true;
        
    }
}