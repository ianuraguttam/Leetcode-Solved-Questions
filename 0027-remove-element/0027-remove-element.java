class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0; //variable for occurance
        int i=0; 
        int j=nums.length-1;
        while(i<nums.length){
            if(nums[i]==val){
               nums[i]=nums[j];
               nums[j]=-1;
               j--;
               count++;
            }
            else{
                i++;
            }
        }
        return nums.length-count;
    }
}