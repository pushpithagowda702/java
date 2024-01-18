public class LeetCode707 {
  

public class MyLinkedList {

  class ListNode {
  int val;
  ListNode next;

  public ListNode(int val) {
      this.val = val;
      this.next = null;
  }
}
  
  private ListNode head;

  public MyLinkedList() {
      this.head = null;
  }

  public int get(int index) {
      if (index < 0) {
          return -1;
      }
      ListNode current = head;
      for (int i = 0; i < index; i++) {
          if (current == null) {
              return -1;
          }
          current = current.next;
      }
      return (current != null) ? current.val : -1;
  }

  public void addAtHead(int val) {
      ListNode newHead = new ListNode(val);
      newHead.next = head;
      head = newHead;
  }

  public void addAtTail(int val) {
      ListNode newNode = new ListNode(val);
      if (head == null) {
          head = newNode;
          return;
      }
      ListNode current = head;
      while (current.next != null) {
          current = current.next;
      }
      current.next = newNode;
  }

  public void addAtIndex(int index, int val) {
      if (index < 0) {
          return;
      }
      if (index == 0) {
          addAtHead(val);
          return;
      }
      ListNode current = head;
      for (int i = 0; i < index - 1; i++) {
          if (current == null) {
              return;
          }
          current = current.next;
      }
      if (current != null) {
          ListNode newNode = new ListNode(val);
          newNode.next = current.next;
          current.next = newNode;
      }
  }

  public void deleteAtIndex(int index) {
      if (index < 0) {
          return;
      }
      if (index == 0 && head != null) {
          head = head.next;
          return;
      }
      ListNode current = head;
      for (int i = 0; i < index - 1; i++) {
          if (current == null || current.next == null) {
              return;
          }
          current = current.next;
      }
      if (current != null && current.next != null) {
          current.next = current.next.next;
      }
  }
}

}
