import java.util.Scanner;

public class TictactoeMain{
    //print and make board here
    // _ | _ | _
    // _ | _ | _
    //   |   |

    static Scanner input = new Scanner(System.in);  

    public static void main (String[] args){
      char[][] gameBoard = {
        {'_','|','_','|','_'},
        {'_','|','_','|','_'},
        {' ','|',' ','|',' '}};
        printBoard(gameBoard); 

        boolean gameOver = false;

        while(!gameOver){
          playerMove(gameBoard);
          gameOver = isGameOver(gameBoard); 
          if(gameOver){
            break;
          }
        }
      }

     
        //2D Array --> for each row in Array
        // {} makes a new row and char in row are seperated by ' ', 
        //the purpose of this is to set up the game board

      public static void playerMove(char[][] gameBoard){
        System.out.println("which player are you? 1 or 2?");
          int player = input.nextInt();

          System.out.println("Choose a spot on the board, 1-9, first row being 1,2,3 and second row 4,5,6 and finally third row is 7,8,9.");
          int move = input.nextInt();

    boolean result = isValidMove(move,gameBoard);

    while(!result){
        System.out.println("Move is invalid");
        move = input.nextInt();
        result = isValidMove(move,gameBoard);
    }
    updateBoard(move,player,gameBoard);

    
}

public static boolean isValidMove(int move, char[][] gameboard){

    switch (move){
        case 1:
            if(gameboard[0][0] == '_'){
                return true;
            } else{
                return false;
            }
        case 2:
            if(gameboard[0][2] == '_'){
                return true;
            } else{
                return false;
            }
        case 3:
            if(gameboard[0][4] == '_'){
                return true;
            } else{
                return false;
            }

        case 4:
            if(gameboard[1][0] == '_'){
                return true;
            } else{
                return false;
            }
        case 5:
            if(gameboard[1][2] == '_'){
                return true;
            } else{
                return false;
            }
        case 6:
            if(gameboard[1][4] == '_'){
                return true;
            } else{
                return false;
            }
        case 7:
            if(gameboard[2][0] == ' '){
                return true;
            } else{
                return false;
            }
        case 8:
            if(gameboard[2][2] == ' '){
                return true;
            } else{
                return false;
            }
        case 9:
            if(gameboard[2][4] == ' '){
                return true;
            } else{
                return false;
            }

        default:
            return false;
    }
}
  
public static boolean isGameOver(char [][] gameboard){

  //Horizontal Win
  if(gameboard[0][0] == 'X'&& gameboard[0][2] == 'X' && gameboard [0][4] == 'X' ){
      System.out.println("Player 1 Wins");
      return true;
  }
  if(gameboard[0][0] == 'O'&& gameboard[0][2] == 'O' && gameboard [0][4] == 'O' ){
      System.out.println("Player 2 Wins");
      return true;
  }
  if(gameboard[1][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [1][4] == 'X' ){
      System.out.println("Player 1 Wins");
      return true;
  }
  if(gameboard[1][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [1][4] == 'O' ){
      System.out.println("Player 2 Wins");
      return true;
  }
  if(gameboard[2][0] == 'X'&& gameboard[2][2] == 'X' && gameboard [2][4] == 'X' ){
      System.out.println("Player 1 Wins");
      return true;
  }
  if(gameboard[2][0] == 'O'&& gameboard[2][2] == 'O' && gameboard [2][4] == 'O' ) {
      System.out.println("Player 2 Wins");
      return true;
  }

  //Vertical Wins

      if(gameboard[0][0] == 'X'&& gameboard[1][0] == 'X' && gameboard [2][0] == 'X' ){
          System.out.println("Player 1 Wins");
          return true;
      }
      if(gameboard[0][0] == 'O'&& gameboard[1][0] == 'O' && gameboard [2][0] == 'O' ){
          System.out.println("Player 2 Wins");
          return true;
      }

      if(gameboard[0][2] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][2] == 'X' ){
          System.out.println("Player 1 Wins");
          return true;
      }
      if(gameboard[0][2] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][2] == 'O' ){
          System.out.println("Player 2 Wins");
          return true;
      }

      if(gameboard[0][4] == 'X'&& gameboard[1][4] == 'X' && gameboard [2][4] == 'X' ){
          System.out.println("Player 1 Wins");
          return true;
      }
      if(gameboard[0][4] == 'O'&& gameboard[1][4] == 'O' && gameboard [2][4] == 'O' ){
          System.out.println("Player 2 Wins");
          return true;
      }

      //Diagonal Wins
      if(gameboard[0][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][4] == 'X' ){
          System.out.println("Player 1 Wins");
          return true;
      }
      if(gameboard[0][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][4] == 'O' ){
          System.out.println("Player 2 Wins");
          return true;
      }

      if(gameboard[2][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [0][4] == 'X' ){
          System.out.println("Player 1 Wins");
          return true;
      }
      if(gameboard[2][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [0][4] == 'O' ){
          System.out.println("Player 2 Wins");
          return true;
      }

      if(gameboard[0][0] != '_' && gameboard[0][2] != '_' && gameboard[0][4] != '_' && gameboard[1][0] !='_'&&
          gameboard[1][2] != '_' && gameboard[1][4] != '_' && gameboard[2][0] != ' ' && gameboard[2][2] != ' ' && gameboard[2][4] != ' '){
          System.out.println("Its a tie");
          return true;
      }

return false;}

  public static void printBoard(char [][] gameBoard){
    //for each character in the 2D Array

    for(char[] row : gameBoard){
        for( char c : row){System.out.print(c);}
        System.out.println();
        //prints out row then prints out a line so that he rows arent printed out on the same line
    }
  }


//to play a piece in the game you have to update the game board char
    //input; player 1 is X
    //       player 2 is O
    //       position would be numbered? 1 | 2 | 3
    //                                   4 | 5 | 6
    //                                   7 | 8 | 9
    //      [0][0] | [0][2] | [0][4]
    //      [1][0] | [1][2] | [1][4]
    //      [2][0] | [2][2] | [2][4]
    // pos 1 is [0][0]



public static void updateBoard(int position, int player, char[][] gameBoard) {
   
    char character;
    character = 'X';
    //sets the varaiable character to X or O based on player 1 or 2

    if (player == 1) {
      character = 'X';
    }
    if (player == 2){
      character = 'O';
    }


    

    switch (position) {
    // swith statement is a statement that swithes the char in the position based on the case
    case 1:
    //case keyword marks a block of code with swith statement
      gameBoard[0][0] = character;
      printBoard(gameBoard);
      break;
    case 2:
      gameBoard[0][2] = character;
      printBoard(gameBoard);
      break;
    case 3:
      gameBoard[0][4] = character;
      printBoard(gameBoard);
      break;
    case 4:
      gameBoard[1][0] = character;
      printBoard(gameBoard);
      break;
    case 5:
      gameBoard[1][2] = character;
      printBoard(gameBoard);
      break;
    case 6:
      gameBoard[1][4] = character;
      printBoard(gameBoard);
      break;
    case 7:
      gameBoard[2][0] = character;
      printBoard(gameBoard);
      break;
    case 8:
      gameBoard[2][2] = character;
      printBoard(gameBoard);
      break;
    case 9:
      gameBoard[2][4] = character;
      printBoard(gameBoard);
      break;
        
    default:
      break;
    }
  }
}




    
    
