class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res= new LinkedList<>();
        if(root==null) return res;
        Queue <TreeNode> q= new LinkedList<>();
        q.add(root);
        Stack <List<Integer>> stk= new Stack<>();
        while(!q.isEmpty()){
            int size= q.size();
            List<Integer> list= new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node= q.poll();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                list.add(node.val);
            }
            stk.push(list);
        }
        while(!stk.isEmpty()) res.add(stk.pop());
        return res;
    }
}