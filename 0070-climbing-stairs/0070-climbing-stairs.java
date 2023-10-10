class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return n;
        }

        int n1 = 1;
        int n2 = 2;

        for (int i = 3; i <= n; i++) {
            int next = n1;
            n1 = n2;
            n2 = next + n2;
        }

        return n2;        
    }
}