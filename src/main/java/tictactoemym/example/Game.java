package tictactoemym.example;
import java.util.Scanner;

public class Game {
   private Board board;
            private char currentPlayer; 
            private Scanner scanner;

            public Game() {
                board = new Board();
                currentPlayer = 'X';
                scanner = new Scanner(System.in);
            }
        
            public void play() {
                boolean endGame = false;
                board.printBoard();

                while (!endGame) {
                  System.out.println("Player " + currentPlayer + " please enter row between 1 & 3");
                  int row = scanner.nextInt() -1;
                  System.out.println("Player " + currentPlayer + " please enter column between 1 & 3");
                  int col = scanner.nextInt() -1;

                  if (!board.playerTurn(row, col, currentPlayer)) {
                    System.out.println("Invalid move, please try again");
                    continue;
                  }

                  board.printBoard();

                  if (board.checkWinner(currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    endGame = true;
                  } else if (board.checkTie()) {
                    System.out.println("It's a draw!");
                    endGame = true;
                  } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                  }
                   }
                scanner.close();
}
}
