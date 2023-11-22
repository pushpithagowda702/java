class Alphabets {
  public static void main(String[] args) {
    capitalLetters();
    lowerCaseLetters();
  }

  static void capitalLetters() {
    for(int i=0; i<26; i++) {
      System.out.print((char)('a' + i) + " ");
    }
    System.out.println();
  }

  static void lowerCaseLetters() {
    for(int i=0; i<26; i++) {
      System.out.print((char)('A' + i) + " ");
    }
    System.out.println();
  }
}