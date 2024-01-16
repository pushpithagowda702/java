public class LeetCode23 {
  class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode mergedList = dummy;

        ListNode current = lists[0];
        dummy.next = current;

        for (int j = 1; j < lists.length; j++) {
            ListNode currentList = lists[j];

            current = dummy;

            while (currentList != null) {
                if (current.next == null || currentList.val <= current.next.val) {
                    ListNode node = currentList;
                    currentList = currentList.next;
                    node.next = current.next;
                    current.next = node;
                } else {
                    current = current.next;
                }
            }
        }

        return dummy.next;
    }
}
}
