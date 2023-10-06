class Solution {
    int start=-1;
    int end=-1;
    public int[] searchRange(int[] nums, int k) {
        start=nums.length;
        binary(nums,k,0,nums.length-1);
        return end==-1?new int[]{-1,-1}:new int[]{start,end};
    }

    private void binary(int[] nums, int k, int l, int h) {
        if(l<=h) {
            int m=((h-l)/2)+l;
            if(nums[m]==k) {
                start=Math.min(start,m);
                end=Math.max(end,m);
                binary(nums,k,m+1,h);
                binary(nums,k,l,m-1);
            } else if(nums[m]<k) {
                binary(nums,k,m+1,h);
            } else {
                binary(nums,k,l,m-1);
            }
        }
    }
}