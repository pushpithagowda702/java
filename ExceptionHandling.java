class ExceptionHandling {
  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    
    String name = "ABC";

    try {
      // divide(a,b);
      if(name == "ABC") {
        throw new UserDefinedExceptions("Name cannot be ABC");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Exception Handling");
    }
  }

  static int divide(int a, int b) throws ArithmeticException {
    if(b == 0) {
      throw new ArithmeticException("B is zero");
    }
    return a/b;
  }
}

class UserDefinedExceptions extends Exception {
  public UserDefinedExceptions(String message) {
    super(message);
  }
}