import java.util.*;

class Person {
  String name;
  int age;
  String address;

  Person (String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }
}

interface Staff_Op {
  public void cal_Salary();
}

interface Student_Op {
  public void cal_Fee();
}

class Student extends Person implements Student_Op {
  int fees;
  Student(int fees, String name, int age, String address) {
    super(name, age, address);
    this.fees = fees;
  }

  public void cal_Fee() {
    this.fees = this.fees + 2000 + 3000;
  }

  public void display() {
    System.out.println("Name: " + super.name + "\nAge: " + super.age + "\nAddress: " + super.address + "\nFees: " + this.fees);
  }
}

class Staff extends Person implements Staff_Op{
  int salary;
  Staff(int salary, String name, int age, String address) {
    super(name, age, address);
    this.salary = salary;
  }

  public void cal_Salary() {
    this.salary = this.salary + 4000 + 3000;
  }

  public void display() {
    System.out.println("Name: " + super.name + "\nAge: " + super.age + "\nAddress: " + super.address + "\nFees: " + this.salary);
  }
}

public class OOP {
  public static void main(String[] args) {
    Staff st = new Staff(100000, "Alex", 24, "Somewhere");
    st.cal_Salary();
    st.display();
    Student s = new Student(250000, "Jhon", 62, "Here");
    s.cal_Fee();
    s.display();
  }
}