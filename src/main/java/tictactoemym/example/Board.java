package tictactoemym.example;


public class Board{
  private char table[][];
  
  public Board(){
    table = new char[3][3];
    for(int x=0; x<3; x++){
      for(int y=0; y<3; y++){
        table[x][y] = '_';
    }
  } 
}

    public void printBoard(){
      for(int x=0; x<3; x++){
        for(int y=0; y<3; y++){
          System.out.print(table[x][y] + " | ");
        }
        System.out.println(""); 
      }
       
        System.out.println("");
    }
  
      public boolean playerTurn(int row, int col, char player) {
        if (row < 0 || row >=3 || col < 0 || col >=3 || table[row][col] != '_'){
          return false;
        }
        table[row][col] = player; 
        return true;
      }
   
      public boolean checkWinner (char player){
        for (int x=0; x<3; x++){
          if (table[x][0] == player && table[x][1] == player && table[x][2] == player)
          return true;
          if (table[0][x] == player && table[1][x] == player && table[2][x] == player)
          return true;
        }
        if (table[0][0] == player && table[1][1] == player && table[2][2] == player)
          return true;
        if (table[0][2] == player && table[1][1] == player && table[2][0] == player)
          return true;
        return false;  
        }

        public boolean checkTie(){
          for (int x=0; x<3; x++){
            for (int y=0; y<3; y++){
              if (table[x][y] == '_')
              return false;
            }
          }
          return true;
        }  
    


      }
     
    
  


  
    