class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        
        ListNode prev = head;
        ListNode curr = head.next;
        
        while (curr != null) {
            if (curr.val >= prev.val) {
                prev = curr;
                curr = curr.next;
                continue;
            }
            
            ListNode tmp = dummy;
            while (curr.val > tmp.next.val) {
                tmp = tmp.next;
            }
            
            prev.next = curr.next;
            curr.next = tmp.next;
            tmp.next = curr;
            curr = prev.next;
        }
        return dummy.next;
    }
}