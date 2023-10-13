class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null) return new ArrayList<List<Integer>>();
        List<Integer> l=new ArrayList<Integer>();
        List<List<Integer>> ml=new ArrayList<List<Integer>>();
        q.add(root);
        l.add(root.val);
        ml.add(new ArrayList<Integer>(l));
        while(q.size()!=0){
            int n=q.size();
            List<Integer> nl=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                TreeNode r=q.poll();
                if(r.left!=null){
                    nl.add(r.left.val);
                    q.add(r.left);
                }
                if(r.right!=null){
                    nl.add(r.right.val);
                    q.add(r.right);
                }
            }
            if(nl.size()!=0) ml.add(new ArrayList<Integer>(nl));
        }
        return ml;
    }

}