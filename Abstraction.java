abstract class Printer {
  abstract public void configuration();
  abstract public void display();
}

class DotMatrix extends Printer {
  public void configuration() {
    System.out.println("DotMatrix");
  }

  public void display() {
    System.out.println("DotMatrix...");
  }
}

class LaserMatrix extends Printer {
  public void configuration() {
    System.out.println("LaserMatrix");
  }

  public void display() {
    System.out.println("DotMatrix...");
  }
}

public class Abstraction {
  public static void main(String[] args) {
    DotMatrix d = new DotMatrix();
    d.configuration();
    d.display();
    LaserMatrix l = new LaserMatrix();
    l.configuration();
    l.display();
  }
}