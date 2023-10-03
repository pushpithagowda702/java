abstract class Vehicle {
  abstract public void drive();
}

class Bicycle extends Vehicle {
  public void drive() {
    System.out.println("Two wheeler");
  }
}

class Car extends Vehicle {
  public void drive() {
    System.out.println("Four wheeler");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    Bicycle b = new Bicycle();
    Car c = new Car();
    b.drive();
    c.drive();
  }
}