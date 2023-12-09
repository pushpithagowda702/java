import java.util.*;

import javax.swing.tree.TreeNode;

public class LeetCode1397 {
  class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        
        
        if(original == null) {
            return cloned;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(cloned);
        
        while(!q.isEmpty()) {
            int levelSize = q.size();
            
            for(int i=0; i<levelSize; i++) {
                TreeNode node = q.poll();
                if(node.val == target.val) {
                    return node;
                }
                
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            
            
        }
        return null;
    }
}
}
