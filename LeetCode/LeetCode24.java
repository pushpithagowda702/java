class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode node = head;
        
        while(node != null && node.next != null) {
            int temp = node.val;
            node.val = node.next.val;
            node.next.val = temp;
            node = node.next.next;
        }
        return head;
    }
}