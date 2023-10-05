
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;

        while(true){

            if(k <=1 || head == null){
                return head;
            }

            ListNode node = current;
            //  check there are k nodes to reverse
            for (int i = 0; i < k-1 && node != null; i++) {
                node = node.next;
            }
            if (node == null) break;
        
            ListNode last = prev;
            ListNode newEnd = current;

            for(int i = 0; current != null && i<k;i++){
                current.next = prev;
                prev = current;
                current = next;
                if(next!=null){
                    next = next.next;
                }
            }

            if(last!=null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = current;
            if(current == null){
                break;
            }

           prev = newEnd;
        }
        return head;

    }
}