class LLRecursion {
  private Node head = null;

  public void insert(int val){
    Node node = new Node(val);
    if (head == null) {
      head = node;
      return;
    }
    node.next = head;
    head = node;
    return;
  }

  public void insR(int val, int ind) {
    head = insRec(val, ind, head);
  }

  private Node insRec(int val, int ind, Node node) {
    if(ind == 0) {
      Node newNode = new Node(val, node);
      return newNode;
    }
    node.next = insRec(val, ind-1, node.next);
    return node;
  }

  public void display() {
    if(head == null) {
      System.out.println("Linked List Empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("END");
  }

  private class Node {
    private int value;
    private Node next;

    private Node(int value) {
      this.value = value;
    }

    private Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}

class Recursion {
  public static void main(String[] args) {
      LLRecursion obj = new LLRecursion();
      obj.insert(4);
      obj.insert(5);
      obj.insert(2);
      obj.insert(5);
      obj.insert(9);
      obj.insert(5);
      obj.insert(20);
      obj.display();
      obj.insR(7, 3);
      obj.display();
  }
}
