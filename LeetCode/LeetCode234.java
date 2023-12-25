import java.util.ArrayList;
import java.util.List;

public class LeetCode234 {
  class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) {
            return true;
        }
        
        List<Integer> l = new ArrayList();
        ListNode temp = head;
        while(temp != null) {
            l.add(temp.val);
            temp = temp.next;
        }
        
        
        for(int i=0; i<l.size()/2; i++) {
            if(l.get(i) != l.get(l.size()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
}
