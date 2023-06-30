class DLL {
  private Node head;

  public void insf(int val) {
    Node node = new Node(val);
    node.next = head;
    node.prev = null;
    if(head != null){
      head.prev = node;
    }
    head = node;
  }

  public void insl(int val) {
    Node node = new Node(val);
    Node temp = head;
    if (head == null) {
      node.prev = null;
      head = node;
      return;
    }
    while(temp.next != null) {
      temp = temp.next;  
    }
    node.prev = temp;
    temp.next = node;
  }

  public void insm(int val, int ind) {
    if(ind == 0){
      insf(val);
      return;
    }
    Node node = new Node(val);
    Node temp = head;
    for(int i=1; i<ind; i++){
      temp = temp.next;
    }
    node.next = temp.next;
    node.prev = temp;
    if (node.next != null){
      temp.next.prev = node;
    }
    temp.next = node;

  }

  public void display() {
    Node temp = head;
    Node last = null;
    while(temp != null){
      System.out.print(temp.value + " ---> ");
      last = temp;
      temp = temp.next;
    }
    System.out.println("END");

    System.out.println("Display in reverse");
    while(last != null){
      System.out.print(last.value + " ---> ");
      last = last.prev;
    }
    System.out.println("START");
  }

  private class Node {
    Node prev;
    int value;
    Node next;

    private Node(int value) {
      this.value = value;
    }

    private Node(Node prev, int value, Node next) {
      this.prev = prev;
      this.value = value;
      this.next = next;
    }
  }
}

class DoublyLinkedList {
  public static void main(String[] args) {
    DLL list = new DLL();
    list.insf(5);
    list.insf(4);
    list.insf(3);
    list.insf(2);
    list.insf(1);
    list.insl(6);
    list.insm(7, 6);
    list.display();
  }
}