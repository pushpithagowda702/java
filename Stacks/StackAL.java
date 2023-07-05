import java.util.*;

class Stacks {
  private ArrayList<Integer> al = new ArrayList<>();

  public boolean isEmpty() {
    return al.size() == 0;
  }

  public void push (int data) {
    al.add(data);
  }

  public int pop() {
    if(isEmpty()){
      return -1;
    }
    int top = al.get(al.size()-1);
    al.remove(al.size()-1);
    return top;
  }

  public int peek() {
    if(isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
    }
    return al.get(al.size()-1);
  }
}

public class StackAL {
  public static void main(String[] args) {
    Stacks s = new Stacks();
    s.push(1);
    s.push(2);
    System.out.println("Popped item: " + s.pop());
    System.out.println(s.peek());
  }
}