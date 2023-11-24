class ABC implements Comparable<ABC> {
  int rollNo;
  String name;
  double totalMarks;

  ABC(int a, String name, double marks) {
    this.rollNo = a;
    this.name = name;
    this.totalMarks = marks;
  }
  
  public int compareTo(ABC x) {
    return (int) this.rollNo - x.rollNo;
  }
}


class ObjectComparision {
  public static void main(String[] args) {
    ABC a = new ABC(18, "Siri", 968);
    ABC b = new ABC(29, "Alexa", 947);

    if(a.compareTo(b) < 0) {
      System.out.println(b.name + " has got more marks");
    } else if(a.compareTo(b) > 0) {
      System.out.println(a.name + " has got more marks");
    } else {
      System.out.println("Both have secured equal marks");
    }
  }
}