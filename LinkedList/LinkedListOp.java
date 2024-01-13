public class LinkedListOp {
  public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.addAtHead(1);
    myLinkedList.addAtTail(3);
    myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
    myLinkedList.display();
    
    System.out.println(myLinkedList.get(1));
    myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
    myLinkedList.get(1); 
    System.out.println(myLinkedList.get(1));
}
}

class MyLinkedList {
    
  private int val;
  private MyLinkedList next;
  MyLinkedList head;
  MyLinkedList tail;

  public MyLinkedList() {
      
  }
  public MyLinkedList(int val) {
      this.val = val;
  }
   public MyLinkedList(int val, MyLinkedList ll) {
      this.next = ll;
  }
  
  public int get(int index) {
      if(head == null) {
          return -1;
      }
      
      
      MyLinkedList temp = head;
      int i = 0;
      while(temp != null && i <= index) {
           if(i==index) {
               return temp.val;
           }
          i++;
          temp = temp.next;
      }
      
      return -1;
  }
  
  public void addAtHead(int val) {
      if(head == null) {
          head = new MyLinkedList(val);
          tail = head;
          return;
      }
      
      MyLinkedList node = new MyLinkedList(val);
      node.next = head;
      head = node;
      
  }
  
  public void addAtTail(int val) {
      if(head == null && tail == null) {
          head = new MyLinkedList(val);
          tail = head;
          return;
      }
      MyLinkedList node = new MyLinkedList(val);
      tail.next = node;
      tail = node;
      
  }
  
  public void addAtIndex(int index, int val) {
      if(head == null) {
          head = new MyLinkedList(val);
          tail = head;
          return;
      }
      
      int i=0;
      MyLinkedList temp = head;
      
      while(temp != null && i<index-1) {
          temp = temp.next;
          i++;
      }
      
      MyLinkedList node = new MyLinkedList(val);
      node.next = temp.next;
      temp.next = node;
  }
  
  public void deleteAtIndex(int index) {
      if(head == null) {
          return;
      }
      
      int i=0;
      MyLinkedList temp = head;
      
      while(temp != null && i<index-1) {
          temp = temp.next;
          i++;
      }
      temp.next = temp.next.next;
  }

  public void display() {
    MyLinkedList temp = head;
    while(temp != null) {
      System.out.println(temp.val);
      temp = temp.next;
    }
  }
}