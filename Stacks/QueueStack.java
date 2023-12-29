import java.util.*;

class Main {
  public static void main(String[] args) {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    s1.push(1);
    s1.push(2);
    s1.push(3);
    s1.push(4);
    rem(s1, s2);
    while(!s1.isEmpty()) {
      System.out.println(s1.peek());
      s1.pop();
    }
  }

    public static int rem(Stack<Integer> s1, Stack<Integer> s2) {
      if (s1.isEmpty()) {
        System.out.println("Queue Empty");
          return -1;
        }
      while(!s1.isEmpty()) {
        s2.push(s1.peek());
        s1.pop();
      }
      int top = s2.pop();
      while(!s2.isEmpty()) {
        s1.push(s2.pop());

























        
      }
      return top;
    }
}