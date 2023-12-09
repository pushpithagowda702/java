public class LeetCode104 {
  class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 1, 0);
    }
    
    private int maxDepth(TreeNode node, int depth, int maxDepth) {
        if(node == null) {
            return 0;
        }
        
        int leftDepth = maxDepth(node.left, depth, maxDepth) + 1;
        int rightDepth = maxDepth(node.right, depth, maxDepth) + 1;
        
        return Math.max(maxDepth, Math.max(leftDepth, rightDepth));
    }
}
}
