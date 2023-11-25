class Human implements Cloneable {
  String name;
  int age;

  Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Human clone() throws CloneNotSupportedException {
    return (Human) super.clone();
  }
}

class Cloning {
  public static void main(String[] args) throws CloneNotSupportedException {
    Human a = new Human("ABC", 20);
    Human b = a.clone();
    System.out.println(b.name);
  }
}