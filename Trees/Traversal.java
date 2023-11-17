import java.util.*;

class Traversal {
  public static void main(String[] args) {
    Tree t = new Tree();
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    t.populateSorted(nums);
    t.display();
    System.out.println("Preorder");
    t.preOrder();
    System.out.println();
    System.out.println("Inorder");
    t.inOrder();
    System.out.println();
    System.out.println("Postorder");
    t.postOrder();
    System.out.println();
  }
}

class Tree {

  public class Node {
    int value;
    Node left;
    Node right;
    int height;

    Node(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }

  private Node root;

  Tree() {
    
  }

  public int height(Node node) {
    if(node == null) {
      return -1;
    }
    return node.height;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void display() {
    display(root, "Root Node: ");
  }

  private void display(Node node, String s) {
    if(node == null) {
      return;
    }
    System.out.println(s + node.getValue());

    display(node.left, "Left child of " + node.getValue() + ": ");
    display(node.right, "Right child of " + node.getValue() + ": ");
  }

  public void insert(int val) {
    root = insert(root, val);
  }

  private Node insert(Node node, int value) {
    if(node == null) {
      node = new Node(value);
      return node;
    }
    if(value < node.value) {
      node.left = insert(node.left, value);
    }

    if(value > node.value) {
      node.right = insert(node.right, value);
    }

    node.height = Math.max(height(node.left), height(node.right)) + 1;

    return node;
  }

  public void populate(int[] nums) {
    for(int i=0; i<nums.length; i++) {
      this.insert(nums[i]);
    }
  }

  public void populateSorted(int[] nums) {
    populateSorted(nums, 0, nums.length - 1);
  }

  private void populateSorted(int[] nums, int start, int end) {
    if(start >= end) {
      return;
    }

    int mid = (start + end) / 2;
    insert(nums[mid]);
    populateSorted(nums, start, mid);
    populateSorted(nums, mid + 1, end);


  }

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {
    if(node == null) {
      return true;
    }

    return (Math.abs(height(node.left) - height(node.right)) <= 1) && balanced(node.left) && balanced(node.right);
  }

  public void preOrder() {
    preOrder(root);
  }

  private void preOrder(Node node) {
    if(node == null) {
      return;
    }

    System.out.print(node.value + " ");
    preOrder(node.right);
    preOrder(node.left);
  }

  public void inOrder() {
    inOrder(root);
  }

  private void inOrder(Node node) {
    if(node == null) {
      return;
    }

    inOrder(node.left);
    System.out.print(node.value + " ");
    inOrder(node.right);
  }

  public void postOrder() {
    postOrder(root);
  }

  private void postOrder(Node node) {
    if(node == null) {
      return;
    }

    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value + " ");
  }
}