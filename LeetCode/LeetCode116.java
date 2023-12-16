public class LeetCode116 {
  class Solution {
    public Node connect(Node root) {
        if(root == null) {
            return root;
        }
        
        Node curr = root;
        
        while(curr.left != null) {
            Node current = curr;
            
            while(current != null) {
                
                current.left.next = current.right;
                
                if(current.next != null) {
                    current.right.next = current.next.left;
                }
                
                current = current.next;
            }
            curr = curr.left;
        }
        return root;
    }
}
}
