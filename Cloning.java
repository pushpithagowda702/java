class Human implements Cloneable {
  String name;
  int age;
  int arr[];

  Human(String name, int age) {
    this.name = name;
    this.age = age;
    this.arr = new int[] {1,2,3,4,5};
  }

  //Shallow copy
  public Human clone() throws CloneNotSupportedException {
    return (Human) super.clone();
  }

  // Deep copy 
  // public Human clone() throws CloneNotSupportedException {
  //  Human twin = (Human) super.clone();
  // twin.arr = new int[twin.arr.length]; 
  // for(int i=0; i<twin.arr.length; i++) {
  //   twin.arr[i] = this.arr[i];
  // }
  //   return twin;
  // }
}

class Cloning {
  public static void main(String[] args) throws CloneNotSupportedException {
    Human a = new Human("ABC", 20);
    Human b = a.clone();
    System.out.println(b.name);
  }
}