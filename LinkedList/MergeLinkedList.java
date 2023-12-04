class Merge {
  private Node head;

  public void add(int val) {
    Node node = new Node(val);
    if(head == null) {
      head = node;
      return;
    }
    node.next = head;
    head = node;
    return;
  }

  public void display() {
    if (head == null) {
      System.out.println("Linked List is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("END");
    return;
  }

  public Merge merge(Merge obj1, Merge obj2) {
    if (obj1.head == null) {
      return obj2;
    }
    Node temp = obj1.head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = obj2.head;
    return obj1;
  }
  
  private class Node {
    private int value;
    private Node next;

    private Node(int val) {
      this.value = val;
    }

    private Node(int val, Node next) {
      this.value = val;
      this.next = next;
    }
  }
}

class MergeLinkedList {
  public static void main(String[] args) {
    Merge obj1 = new Merge();
    Merge obj2 = new Merge();
    obj1.add(1);
    obj1.add(2);
    obj1.add(3);
    obj1.add(4);
    obj1.add(5);
    obj1.display();
    obj2.add(6);
    obj2.add(7);
    obj2.add(8);
    obj2.add(9);
    obj2.add(10);
    obj2.display();
    obj1 = obj1.merge(obj1, obj2);
    obj1.display();
    
  }

}