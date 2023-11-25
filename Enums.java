class Enums {
  enum Months implements Sum {
    January, February, March, April, May, June, July, August, September, October, November, December;

    Months() {
      System.out.println("Months of a year " + this);
    }

    public void display() {
      for(Months x : Months.values()) {
      System.out.println(x + " " + x.ordinal());
      }
    }
  }
  public static void main(String[] args) {
    Months month = Months.March;
    System.out.println(Months.valueOf("May"));
    month.display();    
  }

  interface Sum {
    void display();
  }
}