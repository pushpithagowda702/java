import java.util.*;

class UpperBound<T extends Number> {
  private List<T> l = new ArrayList<>();
  public void add(T a) {
    l.add(a);
  }

  public List<T> getNumber() {
    return l;
  }
}

class GenericsUpperBound {
  public static <T extends Number> double sum(List<T> l) {
    double d = 0;
    for(T x : l) {
      d += x.doubleValue();
    }
    return d;
  }

  public static<T extends Comparable<T>> void sort(List<T> l) {
    Collection.sort(l);
  }
}

public class Generi {
  public static void main(String[] args) {
    UpperBound<Integer> iList = new UpperBound<>();
    UpperBound<Double> dList = new UpperBound<>();
    System.out.println("Menu\n1. Insert Integer\n2. Sum\n3. Sort");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    switch(n) {
      case 1:
      iList.add(1);
      iList.add(6);
      iList.add(3);
      break;
      case 2:
      System.out.println(sum(iList.getNumber()));
      break;

      case 3:
      System.out.println(sort(iList.getNumber()));
      break;
    }
  }
}