class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<String>();
        f (n, "", 0, 0, ans);
        
        return ans;
    }
    static void f (int n, String s, int start, int end, List<String> ans) {

        // to make sure, count of  "(" + ")"  == 2 *  n.
        
        if (start + end == 2 * n) {
            ans.add(s);
            return;
        }

        // count of "(" must be n.
        
        if (start < n) {
            f (n, s + "(", start + 1, end, ans);
        }
        
        // count of ")" must be n.
		
        if (end < start) {
            f (n, s + ")", start, end + 1, ans);
        }
    }
}