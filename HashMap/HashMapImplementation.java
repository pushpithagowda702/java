import java.util.*;

class HashMapImplementation {
  public static void main(String[] args) {
    HashMapCode.MyHashMap<String, String> map = new HashMapCode.MyHashMap<>();
    map.put("India", "Delhi");
    map.put("Japan", "Tokyo");

    ArrayList<String> l = map.keySet();
    for(int i=0; i<l.size(); i++) {
      System.out.println(l.get(i) + " - " + map.get(l.get(i)));
    }
    
  }
}

class HashMapCode {
  static class MyHashMap<K, V> {
    private class Node {
      K key;
      V value;

      Node(K key, V value) {
        this.key = key;
        this.value = value;
      }

    }

    private int n;
    private int N;

    private LinkedList<Node>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
      this.N = 4;
      this.buckets = new LinkedList[4];

      for(int i=0; i<4; i++) {
        this.buckets[i] = new LinkedList<>();
      }
    }

    public void put(K key, V value) {
      int i = hashFunction(key);
      int di = searchLL(key, i);

      if(di == -1) {
        buckets[i].add(new Node(key, value));
        n++;
      } else {
        Node data = buckets[i].get(di);
        data.value = value;
      }

      double alpha = (double) n/N;

      if(alpha > 2) {
        rehash();
      }
    }

    private int hashFunction(K key) {
      return Math.abs(key.hashCode()) % N;
    }

    private int searchLL(K key, int i) {
      for(int j=0; j<buckets[i].size(); j++) {
        if(buckets[i].get(j).key == key) {
          return j;
        }
      }
      return -1;
    }

    private void rehash() {
      LinkedList<Node>[] oBucket = buckets;
      buckets = new LinkedList[N * 2];
      N = N * 2;
      n = 0;

      for(int i=0; i<N; i++) {
        buckets[i] = new LinkedList<>();
      }

      for(int i=0; i<oBucket.length; i++) {
        LinkedList<Node> ll = oBucket[i];
        for(int j=0; j<ll.size(); j++) {
          put(ll.get(j).key, ll.get(j).value);
          n++;
        }
      }
    }

    public V get(K key) {
      int i = hashFunction(key);
      int di = searchLL(key, i);

      if(di == -1) {
        return null;
      } else {
        Node node = buckets[i].get(di);
        return node.value;
      }
    }

    public boolean containsKey(K key) {

      int i = hashFunction(key);
      int di = searchLL(key, i);

      if(di == -1) {
        return false;
      }

      return true;
    }

    public V remove(K key) {
      int i = hashFunction(key);
      int di = searchLL(key,i);

      if(di == -1) {
        return null;
      } else {
        Node node = buckets[i].remove(di);
        n--;
        return node.value;
      }
    }

    public boolean isEmpty() {
      return n == 0;
    }

    public ArrayList<K> keySet() {
      ArrayList<K> keyList = new ArrayList<>();

      for(int i=0; i<buckets.length; i++) {
        LinkedList<Node> l = buckets[i];

        for(int j=0; j<l.size(); j++) {
          keyList.add(l.get(j).key);
        }
      }
      return keyList;
    }

  }
}