package DynamicProgramming;

public class NumberofCoins {
  public static void main(String[] args) {
    int[] coins = {1,6,5,9};
    int amt = 11;
    System.out.println(numberOfCoins(coins, amt));
  }

  static int numberOfCoins(int[] coins, int amt) {
    int sol[][] = new int[coins.length][amt+1];

    for(int i=0; i<coins.length; i++) {
      sol[i][0] = 0;
    }

    for(int i=1; i<amt+1; i++) {
      sol[0][i] = i/coins[0];
    }

    for(int i=1; i<coins.length; i++) {
      for(int j=1; j<amt+1; j++) {
        if(coins[i] > j) {
          sol[i][j] = sol[i-1][j];
        } else {
          sol[i][j] = Math.min(sol[i-1][j], 1+sol[i][j-coins[i]]);
        }
      }
    }


    return sol[coins.length-1][amt];
  }
}
