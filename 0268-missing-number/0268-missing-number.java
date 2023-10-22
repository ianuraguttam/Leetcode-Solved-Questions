class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            hash.add(nums[i]);
        }
        for(int i = 0; i <= hash.size(); i++) {
            if(!hash.contains(i)) return i;
        }
        return -1;
    }
}