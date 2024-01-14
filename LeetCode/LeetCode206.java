public class LeetCode206 {
  class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        ListNode dummy = head;
        
        while(temp.next != null) {
            ListNode curr = temp.next;
            
            temp.next = curr.next;
            
            curr.next = dummy;
            
            dummy = curr;
        }
        return dummy;
    }
}
}
