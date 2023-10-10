class Solution {
    public int searchInsert(int[] nums, int target) {
        int temp;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        int[] arr = new int[nums.length+1];
        for(int i= 0;i<nums.length;i++)
        {
            arr[i] = nums[i];
        }
        arr[arr.length-1] = target;
        for(int i =0;i<arr.length;i++)
        {
            for(int j= i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==target){
                return i;
            }
        }
        return 0;
    }
}