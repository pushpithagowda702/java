import javax.swing.tree.TreeNode;

public class LeetCode700 {
  class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }
        
        while(root != null) {
            if(root.val == val) {
                return root;
            } else if(root.val > val) {
                root = root.left;
            } else if(root.val < val) {
                root = root.right;
            }
        }
        return null;
    }
}
}
