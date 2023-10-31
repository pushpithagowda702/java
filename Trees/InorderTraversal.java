import java.util.*;

class InorderTraversal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution s = new Solution();
    s.populate(sc);
    List<Integer> l = new ArrayList<>();
    l = s.inorderTraversal();
    System.out.println(l);
  }
}

class Solution {

    private TreeNode root;

    public List<Integer> inorderTraversal() {
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

    public void populate(Scanner sc) {
      int val = sc.nextInt();
      System.out.print("Enter the root node value: ");
      root = new TreeNode(val);
      populate(root, sc);
    }

    private void populate(TreeNode node, Scanner sc) {
      System.out.print("Insert to the left of " + node.val + ": ");
      boolean lans = sc.nextBoolean();
      if(lans) {
        System.out.print("Enter the value: ");
        int val = sc.nextInt();
        node.left = new TreeNode(val);
        populate(node.left, sc);
      }

      System.out.print("Insert to the right of " + node.val + ": ");
      boolean rans = sc.nextBoolean();
      if(rans) {
        System.out.print("Enter the value: ");
        int val = sc.nextInt();
        node.right = new TreeNode(val);
        populate(node.right, sc);
      }
    }

    class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { 
      this.val = val; 
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
}