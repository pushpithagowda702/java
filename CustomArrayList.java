import java.util.Arrays;

public class CustomArrayList<E> {

  private Object[] data;
  private int DEFAULT_SIZE = 10;
  private int size = 0;

  public CustomArrayList() {
    this.data = new Object[DEFAULT_SIZE];
  }

  public void add(E val) {
    if(isFull()) {
      resize();
    }

    data[size++] = val;
  }

  private void resize() {

    Object[] temp = new Object[data.length * 2];

    for(int i=0; i<data.length; i++) {
      temp[i] = data[i];
    }

    data = temp;

  }

  public E remove() {
    return (E) data[--size];
  }

  public E get(int index) {
    return (E) data[index];
  }

  public int size() {
    return size;
  }

  public void set(int ind, E val) {
    data[ind] = val;
  }

  public String toString() {
    return toString(data);
  }

  private String toString(Object[] data) {
    return Arrays.toString(Arrays.copyOfRange(data, 0, size));
  }

  private boolean isFull() {
    return data.length == size;
  }
  public static void main(String[] args) {
    CustomArrayList<Integer> c = new CustomArrayList<>();
    
    for(int i=0; i<14; i++) {
      c.add(2*i);
    }
    System.out.println(c);

    CustomArrayList<String> s = new CustomArrayList<>();
    
    for(int i=0; i<14; i++) {
      s.add("a" + i);
    }
    System.out.println(s);
  }
}