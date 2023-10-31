class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root);
    }
    int helper(TreeNode root){
        if(root==null) return 0;
        int s=0;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            s+=root.left.val;
        }
      s+=  helper(root.left);
      s+=helper(root.right);
        return s;
    }
}