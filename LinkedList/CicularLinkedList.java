class cll {
  private Node head;
  private Node tail;

  public cll() {
    this.head = null;
    this.tail = null;
  }

  public void ins(int val){
    Node node = new Node(val);
    if(head == null) {
      head = node;
      tail = node;
      return;
    }
    node.next = head;
    tail.next = node;
    tail = node;
  }

  public void display(){
    Node temp = head;
    if(head != null) {
      do{
        System.out.print(temp.value + " ---> ");
        temp = temp.next;
      } while(temp != head);
      System.out.println("HEAD");
    }
  }

  public void del(int val){
    Node temp = head;
    if(temp == null){
      return;
    }

    if(temp.value == val){
      head = head.next;
      tail.next = head;
    }

    do{
      if(temp.next.value == val) {
        temp.next = temp.next.next;
        break;
      }
      temp = temp.next;
    }while(temp != head);
  }

    private class Node {
      private int value;
      private Node next;

      private Node(int val) {
        this.value = val;
      }

      private Node(int val, int next) {
        this.value = val;
        this.next = next;
      }
    }
}

class CircularLinkedList {
  public static void main(String[] args) {
    cll list = new cll();
    list.ins(1);
    list.ins(2);
    list.ins(3);
    list.ins(4);
    list.display();
    list.del(4);
    list.display();
  }
}