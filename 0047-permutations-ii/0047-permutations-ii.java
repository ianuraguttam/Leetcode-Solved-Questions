class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        helper(0,nums,ans);
        return new ArrayList<>(ans);
    }
    private void helper(int i,int[] nums,Set<List<Integer>> ans) {
        if(i==nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int item:nums) {
                list.add(item);
            }
            ans.add(list);
            return;
        }
        for(int j=i;j<nums.length;j++) {
            swap(nums,i,j);
            helper(i+1,nums,ans);
            swap(nums,i,j);
        }
    }

    private void swap(int[] nums,int i,int j) {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}