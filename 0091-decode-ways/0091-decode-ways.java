class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        if(Integer.valueOf(s.charAt(0) -'0') == 0){
            return 0;
        }
       
        for(int i=0; i<dp.length;i++){
            int a  = Integer.valueOf(s.charAt(i) - '0');
            if(a >= 1 && a <= 9){   
                dp[i] += (i-1 < 0 ) ? 1 : dp[i-1];
            }
            if(i == 0){
                continue;
            }
            int b  = Integer.valueOf(s.charAt(i-1) - '0');
            if(b*10+a >= 10 && b*10+a <= 26){
                dp[i] += (i-2 < 0) ? 1 : dp[i-2];
            }
        }
        return dp[dp.length-1];
    }
}