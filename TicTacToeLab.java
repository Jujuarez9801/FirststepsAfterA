import java.util.Scanner;

public class TicTacToeLab {
        public static final int SIZE = 3;

        public static void main(String [] args) {
            char [][] board = new char[SIZE][SIZE];
            int moves = 0;
            resetBoard(board);
            boolean play = true;
            String replay;
            Scanner in = new Scanner(System.in);

            // replay loop
            while(play) {

                System.out.print("Starting a new game\n");
                resetBoard(board);
                moves = 0;

                // game loop
                while(moves < 9) {
                    printBoard(board);
                    move(board, 'X', in);
                    moves++;

                    if(checkWin(board)) {
                        System.out.print("X won!\n");
                        break;
                    } else if(moves == 9) {
                        System.out.print("Tie!\n");
                        break;
                    }

                    printBoard(board);
                    move(board, 'O', in);
                    moves++;
                         if(checkWin(board)) {
                             System.out.print("O won!\n");
                             break;
                         }
                     }

                    printBoard(board);
                    System.out.print("\n");
                    System.out.print("Play again? (y/n) ");
                    replay = in.next();
                    if(! replay.equalsIgnoreCase("y")) {
                        play = false;
                    }
                }
            }


        public static char getChar(int col, int row) {
//            int index = (row * SIZE) + col + 1;
//            int start = (int) '0';
//            int asc = start + index;
//            return (char) asc;
            return (char)((col+1) + (SIZE * row) + 48); // more efficient way
        }

        public static void resetBoard(char [][] board) {
            for(int row = 0; row < board.length; row++) {
                for(int col = 0; col < board[row].length; col++) {
                    board[row][col] = getChar(col, row);
                }
            }
        }

        public static void printBoard(char [][] board) {
            for(int row = 0; row < board.length; row++) {
                for(int col = 0; col < board[row].length; col++) {
                    System.out.print(board[row][col] + " ");
                }
                System.out.println();
            }
        }

        public static void move(char [][] board, char c, Scanner in) {
            int movePos;
            int row;
            int col;
            do {
                System.out.print(c + ", enter a valid position for your move: ");
                movePos = in.nextInt();
                row = (movePos - 1) / SIZE;
                col = (movePos - 1) % SIZE;
            } while(movePos < 1 || movePos > 9 ||  board[row][col] != movePos + '0' );
            board[row][col] = c;
        }

         public static boolean checkWin(char [][] board) {
             return checkWinHorizontal(board) ||  checkWinVertical(board) ||
                     checkWinDiagonal(board);
         }

        public static boolean checkWinDiagonal(char [][] board) {
            boolean isTrue = false;
            if(board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                isTrue = true;
            }
            return isTrue;
        }

        public static boolean checkWinVertical(char [][] board) {
            boolean isTrue = false;
            for(int col = 0; col < SIZE; col++) {
                if(board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                    isTrue = true;
                }
            }
            return isTrue;
        }

        public static boolean checkWinHorizontal(char [][] board) {
            boolean isTrue = false;
            for(int row = 0; row < SIZE; row++) {
                if(board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                    isTrue = true;
                }
            }
            return isTrue;
        }

}
