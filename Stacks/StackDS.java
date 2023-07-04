class StackClass {
  private Node head;

  public void push(int data) {
    Node node = new Node(data);
    if (isEmpty()) {
      head = node;
      return;
    }
    node.next = head;
    head = node;
  }

  public int pop() {
    if(isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
    }
    int val = head.value;
    head = head.next;
    return val;
  }

  public void peek() {
    if(isEmpty()) {
      System.out.println("Stack is empty");
      return;
    }
    System.out.println(head.value);
  }

  public void display() {
    if(isEmpty()){
      System.out.println("Stack empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("STACK END");
    return;
  }

  public boolean isEmpty() {
    return head == null;
  }


  private class Node {
    private int value;
    Node next;
    
    Node(int val) {
      this.value = val;
    }

    Node(int val, Node next) {
      this.value = val;
      this.next = next;
    }
  }
}

public class StackDS {
  public static void main(String[] args) {
  StackClass obj = new StackClass();
  obj.push(1);
  obj.push(2);
  obj.push(3);
  obj.push(4);
  obj.push(5);
  obj.push(6);

  while(!obj.isEmpty()) {
    obj.peek();
    obj.pop();
  }
}
}