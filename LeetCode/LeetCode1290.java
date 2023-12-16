public class LeetCode1290 {
  class Solution {
    public int getDecimalValue(ListNode head) {
        
        
        return getBinaryString(head);
    }
    
    private int getBinaryString(ListNode head) {
        if(head == null) {
            return -1;
        }
        
        int res = 0;
        
        ListNode node = head;
        while(node != null) {
           res = res << 1;
            res += node.val;
            node = node.next;
        }
        
        return res;
    }
}
}
