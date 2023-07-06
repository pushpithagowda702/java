import java.util.*;

class StackClass {
  private ArrayList<Integer> al = new ArrayList<>();

  public void push(int val) {
    al.add(val);
    return;
  }

  public int pop() {
    if (isEmpty()){
      return -1;
    }
    int top = al.get(al.size()-1);
    al.remove(al.size()-1);
    return top;
  }

  public int peek() {
    if(isEmpty()){
      System.out.println("Stack is empty");
      return -1;
    }
    return al.get(al.size()-1);
  }

  public boolean isEmpty() {
    return al.isEmpty();
  }
}

public class PushBottom {
  public static void main(String[] args) {
    StackClass s = new StackClass();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    pushAtBottom(5, s);
    while(!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
  }

  public static void pushAtBottom(int val, StackClass s){
    if(s.isEmpty()) {
      s.push(val);
      return;
    }
    int top = s.pop();
    pushAtBottom(val, s);
    s.push(top);
    return;
  }
}