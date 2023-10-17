import java.util.*;
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            ans.add(root.val);
            if(root.right!=null) st.add(root.right);
            if(root.left!=null) st.add(root.left);
        }
        return ans;
    }
}