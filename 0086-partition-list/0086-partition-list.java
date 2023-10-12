class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)
            return head;
        Queue<Integer> smaller = new LinkedList<>();
        Queue<Integer> greater = new LinkedList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            if(temp.val < x)
                smaller.add(temp.val);
            else
                greater.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null)
        {
            if(smaller.size() > 0)
                temp.val = smaller.poll();
            else
                temp.val = greater.poll();
            temp = temp.next;
        }
        return head;
    }
}