class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> li = new ArrayList<>();
        while(head != null)
        {
            li.add(head.val);
            head = head.next;
        }
        return CreateTree(li, 0, li.size()-1);
    }
    TreeNode CreateTree(List<Integer> li, int l, int r)
    {
        if(l>r)
        return null;

        int mid = (l + r)/2;

        TreeNode head = new TreeNode(li.get(mid));
        head.left = CreateTree(li, l, mid-1);
        head.right = CreateTree(li, mid + 1, r);
        return head;
    }
}