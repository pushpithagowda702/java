import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapExample {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    // Insertion
    map.put("India", "New Delhi");
    map.put("Japan", "Tokyo");
    map.put("China", "Beijing");
    map.put("South Korea", "Seoul");

    System.out.println(map);

    // Search
    if(map.containsKey("South Korea")) {
      System.out.println("Capital of Korea is: " + map.get("South Korea"));
    }

    System.out.println(map.get("Nepal"));

    // Iteration

    // Method - 1
    for(Map.Entry<String, String> e : map.entrySet()) {
      System.out.println(e.getKey() + " - " + e.getValue());
    }

    // Method - 2
    Set<String> keys = map.keySet();
    for(String key : keys) {
      System.out.println(key + " " + map.get(key));
    }

    // Deletion
    map.remove("China");
    System.out.println(map);
  }
}


