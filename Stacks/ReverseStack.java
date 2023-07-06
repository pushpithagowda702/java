import java.util.*;

class ReverseStack {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    System.out.println(s);
    reverse(s);
    System.out.println(s);

  }
    
  public static void reverse(Stack<Integer> s1) {
    if(s1.isEmpty()) {
      return;
    }
    int top = s1.pop();
    reverse(s1);
    pushAtBottom(s1, top);
  }

  public static void pushAtBottom(Stack<Integer> s1, int val) {
    if(s1.isEmpty()) {
      s1.push(val);
      return;
    }
    int top = s1.pop();
    pushAtBottom(s1, val);
    s1.push(top);
  }
}