class Solution {
    public int jump(int[] nums) {
        int n= nums.length;
        if(n==1){ return 0;}
        int[] steps = new int[n];
        for(int i=n-1;i>=0;i--){
            
            if(nums[i] ==0) {steps[i]= Integer.MAX_VALUE; continue;}
            if(nums[i]+i >= n-1){ steps[i]=1; continue;}
            int min = 100000000;
            for(int j=i+1;j<=i+nums[i] && j<n;j++){
                min = Math.min(min, steps[j]);
                // System.out.println(min);
            }
            System.out.println(i + " a "+ min);
            steps[i]=min+1;
        }
        System.out.println(Arrays.toString(steps));
        return steps[0];
    }
}