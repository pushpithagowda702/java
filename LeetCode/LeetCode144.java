public class LeetCode144 {
  class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        traversal(root, res);
        return res;
    }
    
    private void traversal(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }
        
        res.add(root.val);
        
        traversal(root.left, res);
        traversal(root.right, res);
    }
}
}
