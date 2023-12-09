import javax.swing.tree.TreeNode;

public class LeetCode2236 {
  class Solution {
    public boolean checkTree(TreeNode root) {
        
        
        int sum = 0;
        if(root.left != null) {
            sum += root.left.val;
        } 
        
        if (root.right != null) {
            sum += root.right.val;
        }
        
        
        return root.val == sum;
    }
}
}
