class Solution {
    public void allPathSum(TreeNode root,int targetSum,List<Integer> path,List<List<Integer>> list){
        if(root == null){
            return ;
        }
        path.add(root.val);
        if(root.left == null && root.right == null && root.val == targetSum){
            list.add(new ArrayList<Integer>(path));
        }
        allPathSum(root.left,(targetSum - root.val),path,list);
        allPathSum(root.right,(targetSum - root.val),path,list);
        path.remove(path.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        allPathSum(root,targetSum, new ArrayList<Integer>(),list);
        return list;
    }
}