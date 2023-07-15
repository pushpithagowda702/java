import java.util.*;

class LL {
  private Node head;
  private Node tail;
  private int size;

  public LL() {
    this.size = 0;
  }
// Insertion in the begining
  public void ins(int val) {
    Node node = new Node(val);
    node.next = head;
    head = node;
    if (tail == null) {
      tail = head;
    }
    size += 1;
  }
// Insertion at the end
  public void insl(int val) {
    if (tail == null) {
      ins(val);
      return;
    }
    Node node = new Node(val);
    tail.next = node;
    tail = node;
    size += 1;
  }
// Insertion in the middle
  public void insm(int val, int ind) {
    if(ind == 0) {
      ins(val);
      return;
    }
    if(ind==size) {
      insl(val);
      return;
    }
    Node temp = head;
    for(int i=1; i<ind; i++){
      temp = temp.next;
    }
    Node node = new Node(val, temp.next);
    temp.next = node;
  }

  public void display(){
    Node temp = head;
    while(temp != null) {
      System.out.print(temp.value + " -----> ");
      temp = temp.next;
    }
    System.out.println("END");
  }
// Deletion from begining 
  public int del(){
    if(head == null){
      tail = null;
    }
    int val = head.value;
    head = head.next;
    size--;
    return val;
  }
// Deletion from the end
  public int dell() {
    Node temp = head;
    for(int i=0; i<size-1; i++){
      temp = temp.next;
    }
    int val = tail.value;
    tail = temp;
    tail.next = null;
    size--;
    return val;
  }
// Deleting from the middle
  public int delm(int ind){
    Node prev = head;
    for (int i=0; i<ind; i++){
      prev = prev.next;
    }
    int value = prev.next.value;
    prev.next = prev.next.next;
    size--;
    return value;
  }
// Find value in the list
  public Node find(int val){
    Node node = head;
    while(node != null) {
      if(node.value == val){
        return node;
      }
      node = node.next;
    }
    return null;
  }

  private class Node {
    private int value;
    private Node next;

   public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
     this.value = value;
     this.next = next;
   }
  }
}

public class LinkedList {
  public static void main(String[] args) {
    LL obj = new LL();
    obj.ins(3);
    obj.ins(4);
    obj.ins(5);
    obj.ins(11);
    obj.ins(15);
    obj.display();
    obj.insl(2);
    obj.insl(1);
    obj.display();
    obj.insm(8, 4);
    obj.display();
    System.out.println(obj.del());
    obj.display();
    System.out.println(obj.dell());
    obj.display();
    System.out.println(obj.delm(3));
    obj.display();
    System.out.println("Value present at: " + obj.find(5));
    System.out.println("Value present at: " + obj.find(25));
  }
}
