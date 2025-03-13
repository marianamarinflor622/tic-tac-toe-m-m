package tictactoemym.example;
import java.util.Scanner;


public class Board{
  private char board[][];
  
  public Board(){
    board = new char[3][3];
    for(int x=0; x<3; x++){
      for(int y=0; y<3; y++){
        board[x][y] = '_';
    }
  } 
}

    public void printBoard(){
      for(int x=0; x<3; x++){
        for(int y=0; y<3; y++){
          System.out.print(board[x][y] + " | ");
        }
        System.out.println(""); 
      }
       
        System.out.println("");
    }
  
      public boolean playerTurn(int row, int col, char player) {
        if (row < 0 || row >=3 || col < 0 || col >=3 || board[row][col] != '_'){
          return false;
        }
        board[row][col] = player; 
        return true;
      }
   
      public boolean checkWinner (char player){
        for (int x=0; x<3; x++){
          if (board[x][0] == player && board[x][1] == player && board[x][2] == player)
          return true;
          if (board[0][x] == player && board[1][x] == player && board[2][x] == player)
          return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
          return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
          return true;
        return false;  
        }

        public boolean checkTie(){
          for (int x=0; x<3; x++){
            for (int y=0; y<3; y++){
              if (board[x][y] == '_') {
                return false;
              }
            }
          }
          return true;
        }  

     } 

       class Game{
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
                  System.out.println("Player" + currentPlayer + " please enter row and column between 1 & 3");
                  int row = scanner.nextInt() -1;
                  int col = scanner.nextInt() -1;

                  if (!board.playerTurn(row, col, currentPlayer)) {
                    System.out.println("Invalid move, please try again");
                    continue;
                  }

                  board.printBoard();

                  if (board.checkWinner(currentPlayer)) {
                    System.out.println("player " + currentPlayer + " wins!");
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

       


      
     