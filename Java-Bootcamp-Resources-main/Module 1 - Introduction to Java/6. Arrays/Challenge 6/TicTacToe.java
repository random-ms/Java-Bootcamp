import java.util.Scanner;

public class TicTacToe {
      static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("\nLet's play tic tac toe");
            char[][] board = {
                    {'_','_','_'},
                    {'_','_','_'},
                    {'_','_','_'}
            };
            printBoard(board);

            scan.close();
    }

    public static void printBoard(char[][] board){
      System.out.println("\n");
      for (int i = 0; i < board.length; i++) {
        System.out.print('\t');
        for (int j = 0; j < board[i].length; j++) {
          System.out.print(board[i][j] + " ");
        }
        System.out.print("\n\n");
      }
      
    }
}
