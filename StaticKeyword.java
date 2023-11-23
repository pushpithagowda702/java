class StaticKeyword {

  static int x = 10;
  static int y;

  static {
    y += x * 10;
  }

  public static void main(String[] args) {
    Human a = new Human("a", 23, "F");
    Human b = new Human("b", 32, "F");
    System.out.println(Human.population);
    // Static block will only run once
    System.out.println(y);
    x = 20;
    System.out.println(y);

    Human.Children c = new Human.Children("Bob", 3);
    System.out.println(c.name);

  }
}

class Human {
  String name;
  int age;
  String gender;
  static long population;

  Human (String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    Human.population += 1;
  }

  static class Children {
    String name;
    int age;

    Children(String name, int age) {
      this.name = name;
      this.age = age;
    }

  }
}