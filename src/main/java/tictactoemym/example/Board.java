package tictactoemym.example;

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

      

       


      
     