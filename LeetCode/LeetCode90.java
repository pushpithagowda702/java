import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inorderTraversal(l, root);
        
        return l;
        
    }
    
    private void inorderTraversal(List<Integer> l, TreeNode node) {
        if(node == null) {
            return;
        }
        
        inorderTraversal(l, node.left);
        l.add(node.val);
        inorderTraversal(l, node.right);
        
    }
} {
  
}
