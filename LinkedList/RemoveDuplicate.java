class LinkedList {
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

  public void remove(){
    Node temp = head;
    while (temp.next != null) {
      if(temp.value == temp.next.value) {
        temp.next = temp.next.next;
      } else {
        temp = temp.next;
      }
    }
  }

  public void display(){
    if(head == null){
      System.out.println("Linked List is empty");
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("END");
    return;
  }

  private class Node {
    private int value;
    private Node next;

    private Node(int val) {
      this.value = val;
    }

    private Node(int val, Node next){
      this.value = val;
      this.next = next;
    }
  }
}

class RemoveDuplicate {
  public static void main(String[] args) {
    LinkedList obj = new LinkedList();
    obj.add(1);
    obj.add(1);
    obj.add(2);
    obj.add(2);
    obj.add(3);
    obj.add(3);
    obj.add(3);
    obj.display();
    obj.remove();
    obj.display();
  }
}