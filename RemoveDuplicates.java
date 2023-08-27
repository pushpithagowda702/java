import java.util.*;

class RemoveDuplicate {
  public static void main(String[] args) {
    List<Integer> array = new ArrayList<Integer>();
    List<Integer> noduplicates = new ArrayList<Integer>();
    array.add(1);
    array.add(5);
    array.add(1);
    array.add(5);
    array.add(3);
    array.add(15);
    array.add(11);
    array.add(5);
    array.add(7);
    array.add(5);
    array.add(1);
    array.add(2);
    array.add(3);
    array.add(4);

    outerloop:
    for(int i=0; i<array.size(); i++) {
      for(int j=0; j<noduplicates.size(); j++) {
        if(array.get(i) == noduplicates.get(j)) {
          continue outerloop;
        }
      }
      noduplicates.add(array.get(i));
    }

    System.out.println(array);
    System.out.println(noduplicates);
  }
}