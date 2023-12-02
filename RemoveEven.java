import java.util.ArrayList;

public class RemoveEven {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(40);
    list.add(20);
    list.add(30);
    list.add(4);
    list.add(140);
    list.add(203);
    list.add(304);
    list.add(421);
    list.add(410);
    list.add(203);
    list.add(301);
    list.add(412);
    list.add(146);
    list.add(213);
    list.add(3047);
    list.add(4212);

    System.out.println(list);

    for(int i=0; i<list.size(); i++) {
      if(list.get(i)%2 == 0) {
        list.remove(i);
        i--;
      }
    }
    System.out.println(list);
  }
}
