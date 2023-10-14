class Solution {

    // Pointer to track preorder list.
    public static int currentIndx = 0;

    // Helps to find the location of node in inorder list in O(1)
    HashMap<Integer, Integer> cache;

    // Function as described in pseudocode above
    public TreeNode constructTree(int[] preorder, int[] inorder, int start, int end) {

        if(currentIndx >= preorder.length) return null;

        // Creating the node from preorder
        int headNodeValue = preorder[currentIndx++];
        TreeNode head = new TreeNode(headNodeValue);

        int targetIndx = cache.get(headNodeValue);

        // Finding Left Subtree from inorder
        if(targetIndx - start > 0) {
            head.left = constructTree(preorder, inorder, start, targetIndx - 1);
        }

        // Finding Right Subtree from inorder
        if(end - targetIndx > 0) {
            head.right = constructTree(preorder, inorder, targetIndx + 1, end);
        }

        return head;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        currentIndx = 0;
        cache = new HashMap<Integer, Integer>();
        for(int i = 0; i < inorder.length; i++) {
            cache.put(inorder[i], i);
        }
        return constructTree(preorder, inorder, 0, preorder.length - 1);
    }
}