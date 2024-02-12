package TTT;

public class Main extends Logic {
    
    public static void main(String[] args) {
        
        System.out.println("\nLet's play tic tac toe");

        char[][] board = {
                    {'_','_','_'},
                    {'_','_','_'},
                    {'_','_','_'}
        };
 
        printBoard(board);

        for (int i = 0; i < 9; i++) {

            if (i%2 == 0){
                System.out.println("Turn: X");
                int[]spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
            } else {
                System.out.println("Turn: O");
                int[]spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
            }

            printBoard(board);
            
            int count = checkWin(board);
    
            if (count == 3) { System.out.println("X Wins!"); break; }
            else if (count == -3) { System.out.println("O Wins!"); break; }
        }  { System.out.println("IT'S A TIE!"); }
        scan.close();
    }
    
}
