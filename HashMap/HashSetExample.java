import java.util.HashSet;
import java.util.Iterator;

class HashSetExample {
  public static void main(String[] args) {

    HashSet<Integer> set = new HashSet<>();
    // Insertion
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    System.out.println(set);

    // Searching
    System.out.println(set.contains(4));
    System.out.println(set.contains(6));

    // Deletion
    set.remove(3);
    System.out.println(set);

    // Size of set
    System.out.println("Size: " + set.size());

    // Set Iteration
    Iterator it = set.iterator();

    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}