import java.util.*;

class HeapSort {
  public static void main(String[] args) {
    Heap<Integer> h = new Heap<>();
    h.insert(10);
    h.insert(20);
    h.insert(23);
    h.insert(2);
    h.insert(12);
    h.insert(21);
    h.insert(25);
    h.insert(62);    
    h.insert(100);
    h.insert(210);
    h.insert(523);
    h.insert(22);
    h.insert(162);
    h.insert(2211);
    h.insert(251);
    h.insert(626);
    h.insert(1);
    try {
      System.out.println(h.heapSort());
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
     
  }
}

class Heap<T extends Comparable<T>> {
  private ArrayList<T> list;

  public Heap() {
    list = new ArrayList<>();
  }

  private void swap(int a, int b) {
    T temp = list.get(a);
    list.set(a, list.get(b));
    list.set(b, temp);
  }


  private int parent(int index) {
    return (index-1) / 2;
  }

  private int left(int index) {
    return (index * 2) + 1;
  }

  private int right(int index) {
    return (index * 2) + 2;
  }

  public void insert(T val) {
    list.add(val);
    upheap(list.size() - 1);
  }

  private void upheap(int index) {
    if (index == 0) {
      return;
    }

    int p = parent(index);
    if(list.get(index).compareTo(list.get(p)) < 0) {
      swap(index, p);
      upheap(p);
    }
  }

  public T remove() throws Exception {
    if(list.isEmpty()) {
      throw new Exception("List empty");
    }

    T data = list.get(0);
    T last = list.remove(list.size() - 1);
    if(!list.isEmpty()) {
      list.set(0, last);
      downheap(0);
    }
    return data;
  }

  private void downheap(int index) {
    
    int min = index;
    int left = left(index);
    int right = right(index);

    if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
      min = left;
    }

    if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
      min = right;
    }

    if(min != index) {
      swap(min, index);
      downheap(min);
    }
  }

  public ArrayList<T> heapSort() throws Exception {
    ArrayList<T> sortedList = new ArrayList<>();

    while(!list.isEmpty()) {
      sortedList.add(this.remove());
    }
    return sortedList;
  }
}
