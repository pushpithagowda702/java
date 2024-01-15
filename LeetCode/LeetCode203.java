public class LeetCode203 {
  class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        int i = 0;
        
        
        while(curr != null) {
            if(curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            
            curr = curr.next;
        }
        head = dummy.next;
        
        return head;
    }
}
}
