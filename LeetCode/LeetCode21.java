public class LeetCode21 {
  class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        
        if(list2 == null) {
            return list1;
        }
        
        ListNode sol = new ListNode(0);
        ListNode dummy = sol;
        
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                dummy.next = list1;
                dummy = dummy.next;
                list1 = list1.next;
            } else {
                dummy.next = list2;
                dummy = dummy.next;
                list2 = list2.next;
            }
        }
        
        if(list1 == null) {
            dummy.next = list2;
        }
        
        if(list2 == null) {
            dummy.next = list1;
        }
        
        return sol.next;
    }
}
}
