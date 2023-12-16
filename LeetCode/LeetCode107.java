import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LeetCode107 {
  class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> l = new ArrayList<>();
            
            for(int i=0; i<levelSize; i++) {
                TreeNode n = q.poll();
                l.add(n.val);
                if(n.left != null) q.offer(n.left);
                if(n.right != null) q.offer(n.right);
            }
            res.add(0, l);
        }
        return res;
    }
}
}
