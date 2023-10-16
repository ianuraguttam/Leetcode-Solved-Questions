class Solution {
    
    private int helper(TreeNode root, int tempSum){
        if(root==null){
            return 0;
        }
        tempSum = tempSum*10 + root.val;
        if(root.left == null && root.right ==null){
            return tempSum;
        }
        return helper(root.left, tempSum) + helper(root.right, tempSum);
    }

    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
}