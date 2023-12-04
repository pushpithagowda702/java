package DynamicProgramming;

public class CoinWays {
  public static void main(String[] args) {
    int[] coins = {1,2,5};
    int amt = 5;

    System.out.println(ways(coins, amt));
  }

  static int ways(int[] coin, int amt) {
    int[][] sol = new int[coin.length][amt+1];

    for(int i=0; i<coin.length; i++) {
      sol[i][0] = 1;
    }

    for(int i=1; i<amt+1; i++) {
      if(i < coin[0] || i%coin[0] != 0) {
        sol[0][i] = 0;
      } else if(i%coin[0] == 0) {
        sol[0][i] = 1;
      }
    }

    for(int i=1; i<sol.length; i++) {
      for(int j=1; j<amt+1; j++) {
        if(j < coin[i]) {
          sol[i][j] = sol[i-1][j];
        } else {
          sol[i][j] = sol[i-1][j] + sol[i][j - coin[i]];
        }
      }
    }

    return sol[coin.length-1][amt];
  }
}
