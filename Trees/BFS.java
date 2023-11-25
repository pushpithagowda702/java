import java.util.*;
import java.util.LinkedList;

class BFS {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BinaryTree tree = new BinaryTree();
    tree.populate(sc);
    tree.display();
    System.out.println(tree.bfs());
  }
}

class BinaryTree {
  private Node root;

  private static class Node {
    int val;
    Node left;
    Node right;

    private Node(int val) {
      this.val = val;
    }
  }
    public void populate(Scanner scanner) {
      System.out.println("Enter root node: ");
      int value = scanner.nextInt();
      root = new Node(value);
      populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
      System.out.println("Insert left of: " + node.val);
      boolean answer = scanner.nextBoolean();
      if(answer) {
        System.out.println("Enter the value to be inserted to the left of: " + node.val);
        int val = scanner.nextInt();
        node.left = new Node(val);
        populate(scanner, node.left);
      }
      System.out.println("Insert right of: " + node.val);
      boolean right = scanner.nextBoolean();
      if(right) {
        System.out.println("Enter the value to be inserted to the right of: " + node.val);
        int val = scanner.nextInt();
        node.right = new Node(val);
        populate(scanner, node.right);
      }

    }

    public void display() {
      display(root, "");
    }

    private void display(Node node, String s) {
      if(node==null) {
        return;
      }
      System.out.println(s + node.val);
      display(node.left, s+"\t");
      display(node.right, s+"\t");

    }

    public void treeDisplay() {
      treeDisplay(root, 0);
    }

    private void treeDisplay(Node node, int level) {
      if (node == null) {
        return;
      }
      treeDisplay(node.right, level+1);
      if(level != 0) {
        for(int i=0; i<level-1; i++) {
          System.out.print("|\t");
        }
        System.out.println("|------->"+node.val);
      } else {
        System.out.println(node.val);
      }
      treeDisplay(node.left, level+1);
    }


    public List<Integer> bfs() {
      Queue<Node> q = new LinkedList<>();

      List<Integer> l = new ArrayList<>();
      bfs(root, q, l);
      return l;
    }

    private List<Integer> bfs(Node node, Queue<Node> q, List<Integer> l) {
      if(node == null) { 
        return l;
      }

      l.add((Integer) node.val);
      q.add(node.left);
      q.add(node.right);
      Node n = q.remove();
      bfs(n, q, l);
      return l;
    }

  }