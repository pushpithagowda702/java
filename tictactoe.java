import java.util.Scanner;

class tictactoe {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] board = new char[3][3];
    for(int row=0; row < board.length; row++) {
      for(int col=0; col < board[row].length; col++) {
        board[row][col] = ' ';
      }
    }
    
    char player = 'X';
    boolean gameover = false;
    boolean drawGame = false;

    while(!gameover) {
      printBoard(board);
      System.out.print("Enter the position: ");
      int row = sc.nextInt();
      int col = sc.nextInt();

      if(board[row][col] == ' ') {
        board[row][col] = player;
        gameover = hasWon(board, player);
        if(gameover) {
          System.out.println("Player " + player + " won");
          return;
        } else {
          player = (player == 'X')? 'O' : 'X';
        }
      } else {
        System.out.println("Invalid move");
      }

      if(!drawGame) {
        System.out.println("Draw Game");
      }
    }
  }

  public static void printBoard(char[][] board) {
    for(int row=0; row<board.length; row++) {
      System.out.print("| ");
      for(int col=0; col<board[row].length; col++) {
        System.out.print(board[row][col] + " | ");
      }
      System.out.println();
    }
  }

  public static boolean hasWon(char[][] board, char player) {
    for(int row=0; row<board.length; row++) {
      for(int col=0; col<board[row].length; col++) {
        if(board[row][0] == player && board[row][1] == player && board[row][2] == player) {
          return true;
        } else if(board[0][col] == player && board[1][col] == player && board[2][col] == player) {
          return true;
        } else if(board[0][0] == player && board[1][1] == player && board[2][1] == player) {
          return true;
        } else if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean drawMatch(char[][] board, char player) {
    for(int row=0; row<board.length; row++) {
      for(int col=0; col<board[row].length; col++) {
        if (board[row][col] = ' ') {
          return false;
        }
      }
    }
    return true;
  }
}