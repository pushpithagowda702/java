public class LargeStrings {
  public static void main(String[] args) {
    StringBuffer s1 = new StringBuffer();
    System.out.println(s1.capacity());
    StringBuffer s2 = new StringBuffer("Constructor 2");
    StringBuffer s3 = new StringBuffer(30);
    System.out.println(s3.capacity());
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    s1.append("constructor");
    s1.append(" 1");
    System.out.println(s1);
    s2.insert(13, "!");
    System.out.println(s2);
    s3.append("Constructor 3");
    System.out.println(s3);
    s1.replace(0, 1, "C");
    System.out.println(s1);
    System.out.println(s1.reverse());
  }
}
