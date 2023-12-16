import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

public class LeetCode103 {
  class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) {
            return res;
        }
        
        Deque<TreeNode> q = new LinkedList<>();
        boolean flag = false;
        q.offer(root);
        
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> l = new ArrayList<>();
            
            for(int i=0; i<levelSize; i++) {
                
                
                if(!flag) {
                    TreeNode n = q.pollLast();
                    l.add(n.val);
                   if(n.left != null) q.offerFirst(n.left);
                   if(n.right != null) q.offerFirst(n.right);
                } else {
                    TreeNode n = q.pollFirst();
                    l.add(n.val);
                   if(n.right != null) q.offerLast(n.right);
                   if(n.left != null) q.offerLast(n.left);
                }
                
                
            }
            res.add(l);
            flag = !flag;
        }
        return res;
        
    }
}
}
