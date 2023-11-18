class SegmentTree {
  public static void main(String[] args) {
    int[] array = {3, 8, 6, 7, -2, -8, 4, 9};
    ST t = new ST(array);
    t.display();
    System.out.println(t.query(1, 6));

  }
}

class ST {
  private class Node {
    int data;
    int startInterval;
    int endInterval;
    Node left;
    Node right;

    Node(int startInterval, int endInterval) {
      this.startInterval = startInterval;
      this.endInterval = endInterval;
    }
  }

  Node root;

  ST(int[] array) {
    this.root = constructTree(array, 0, array.length - 1);
  }

  private Node constructTree(int[] array, int start, int end) {
    if(start == end) {
      Node leaf = new Node(start, end);
      leaf.data = array[start];
      return leaf;
    }

    Node node = new Node(start, end);
    int mid = (start + end) / 2;

    node.left = constructTree(array, start, mid);
    node.right = constructTree(array, mid+1, end);

    node.data = node.left.data + node.right.data;
    return node;
  }

  public void display() {
    display(this.root);
  }

  private void display(Node node) {
    String s = "";

    if (node.left != null) {
      s = s + "Interval [" + node.left.startInterval + ", " + node.left.endInterval + "] "  + node.left.data + " ";
    } else {
      s = s + "No child";
    }

    s = s + "Interval [" + node.startInterval + ", " + node.endInterval + "] "  + node.data + " ";

    if (node.right != null) {
      s = s + "Interval [" + node.right.startInterval + ", " + node.right.endInterval + "] "  + node.right.data + " ";
    } else {
      s = s + "NO child";
    }

    System.out.println(s);

    if(node.left != null) {
      display(node.left);
    }

    if(node.right != null) {
      display(node.right);
    }
  } 

  public int query(int qsi, int qei) {
    return this.query(root, qsi, qei);
  }

  private int query(Node node, int qsi, int qei) {

    if(node.startInterval >= qsi && node.endInterval <= qei) {
      return node.data;
    } else if(node.startInterval > qei || node.endInterval < qsi) {
      return 0;
    } else {
      return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
    }

  }

  public void update(int val, int index) {
    this.root.data = update(this.root, index, val);
  }

  private int update(Node node, int index, int val) {
    if(index >= node.startInterval && index <= node.endInterval) {
      if(index == node.startInterval && index == node.endInterval) {
        node.data = val;
        return node.data;
      } else {
        node.data = update(node.left, index, val) + update(node.right, index, val);
        return node.data;
      }
    }
    return node.data;
  }
}