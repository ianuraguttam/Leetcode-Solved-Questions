class Solution {
    // Connect Function
    public Node connect(Node root) {
        // call build Tree Function
        buildTree(root);
        // return root
        return root;
    }
    
    // Build Tree Function
    void buildTree(Node root) {
        // if root is not null
        while(root != null) {
            // create a dummy node with value of 0
            Node dummy = new Node(0);
            // create a variable prev which stores the value of dummy node
            Node prev = dummy;
                
            // looping till current is not equal to null
            for(Node curr = root; curr != null; curr = curr.next) {
                if(curr.left != null) {
                    prev.next = curr.left;
                    prev = curr.left;
                }
                if(curr.right != null) {
                    prev.next = curr.right;
                    prev = curr.right;
                }
            }
             root = dummy.next;
        }
    }
}