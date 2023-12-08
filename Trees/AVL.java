class AVL {
  public static void main(String[] args) {
    AVLTree t = new AVLTree();

    for(int i=0; i<1000; i++) {
      t.insert(i);
    }

    System.out.println(t.height());
  }
}

class AVLTree {
  class Node {
    int value;
    Node left;
    Node right;
    int height;

    Node(int value) {
      this.value = value;
    }
  }

  private Node root;
  
  public boolean isEmpty() {
    return root == null;
  }

  public int height() {
    return height(root);
  }
  private int height(Node node) {
    if (node == null) {
      return -1;
    }

    return node.height;
  }

  public void display() {
    display(root, "Root Node: ");
  }

  private void display(Node node, String s) {
    if(node == null) {
      return;
    }
    System.out.println(s + node.value);
    display(node.left, "Left child of " + node.value + ": ");
    display(node.right, "Right child of " + node.value + ": ");
  }

  public void insert(int val) {
    insert(root, val);
  } 

  private Node insert(Node node, int val) {
    if(node == null) {
      node = new Node(val);
      return node;
    }

    if(node.value < val) {
      node.left = insert(node.left, val);
    }

    if(node.value > val) {
      node.right = insert(node.right, val);
    }
    node.height = Math.max(height(node.left), height(node.right)) + 1;
    return rotate(node);
  }

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {
    if(node == null) {
      return true;
    }
    return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
  }

  private Node rotate(Node node) {
    if(height(node.left) - height(node.right) > 1) {
      if(height(node.left.left) - height(node.left.right) > 0) {
        return rightRotate(node);
      }

      if(height(node.left.left) - height(node.left.right) < 0) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
      }
    }

    if(height(node.left) - height(node.right) < -1) {
      if(height(node.right.left) - height(node.right.right) < -1) {
        return leftRotate(node);
      }

      if(height(node.right.left) - height(node.right.right) > 1) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
      }

    }

    return node;
  }

  public Node rightRotate(Node p) {
    Node c = p.left;
    Node t = c.right;
    c.right = p;
    p.left = t;

    p.height = Math.max(height(p.left), height(p.right)) + 1;
    c.height = Math.max(height(c.left), height(c.right)) + 1;
    return c;
  }

  public Node leftRotate(Node c) {
    Node p = c.right;
    Node t = p.left;

    p.left = c;
    c.right = t;
    p.height = Math.max(height(p.left), height(p.right)) + 1;
    c.height = Math.max(height(c.left), height(c.right)) + 1;
    return p;
  }

  public void populate(int[] nums) {
    for(int i=0; i<nums.length; i++) {
      insert(nums[i]);
    }
  }
} 