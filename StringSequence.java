class Main {
  public static void main(String[] args) {
    String s = "a1acbacab2131231b";
    int i=0;
    String sol = "";
    
    while(i < s.length()-1) {
      if((s.charAt(i) == 'a' && s.charAt(i+1) == '1') || (s.charAt(i) == 'b' && s.charAt(i+1) == '2') || (s.charAt(i) == 'c' && s.charAt(i+1) == '3')) {
        s = remove(s, i);
        i=0;
      } else {
        i = i+1;
      }
     }
    System.out.println(s.length()==sol.length());
  }

  public static String remove(String s, int ind) {
    String sol = "";
    int i = 0;
    while(i < s.length()) {
        if(i != ind && i != ind + 1) {
          sol += Character.toString(s.charAt(i));
          
        } 
        i = i + 1;
    }
    return sol;
  }


}