import java.util.*;

class BST {
  public static void main(String[] args) {
    Tree t = new Tree();
    int[] nums = {10, 9, 8, 5, 7, 23, 34, 22, 42};
    t.populate(nums);
    t.display();
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

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {
    if(node == null) {
      return true;
    }

    return Math.abs(height(node.left) - height(node.right) <= 1) && balanced(node.left) && balanced(node.right);
  }
}