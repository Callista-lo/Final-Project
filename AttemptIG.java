import java.util.Scanner;
import java.lang.Integer;

public class AttemptIG {
    

  //  public static  writeToBoard(int y, String Callie, String [] Callista){

        
      //  String InComing = Integer.toString(y);
        
       
//    }

    public static void printBoard(String[] Board){
        System.out.println ("     |   |    ");
        System.out.println ("   1 | 2 | 3  ");
        System.out.println (" ----+---+---- ");
        System.out.println ("   4 | 5 | 6  ");
        System.out.println (" ----+---+---- ");
        System.out.println ("   7 | 8 | 9  ");
        System.out.println ("     |   |    ");
String board = "";
       for(int c = 0; c < 9; c++){
        for(int i = 0; i < 3; i++)
        {
             board = Board[c] + "|";
        }
        System.out.println(board);
       }
    }

    public static void main(String[] args){  
    
        Boolean isX = true;
       // String[] Callista = new String[9];
      String[] Callista = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        System.out.println ();
        System.out.println ("WELCOME TO CALLISTA'S TTT (Tic Tac Toe) GAME!!!");
        System.out.println ();
        System.out.println ("     |   |    ");
        System.out.println ("   1 | 2 | 3  ");
        System.out.println (" ----+---+---- ");
        System.out.println ("   4 | 5 | 6  ");
        System.out.println (" ----+---+---- ");
        System.out.println ("   7 | 8 | 9  ");
        System.out.println ("     |   |    ");
        System.out.println ();
        System.out.println ("First player is X, Second player is O.");
        System.out.println ();
        System.out.println ("Please insert a number.");
        System.out.println ();
        
        int n = 0;
        Scanner user = new Scanner(System.in);
        while (n < 9){
            
             int c = user.nextInt();
            if (isX == true){
                for(int i = 0; i < 9; i++){
                   if (Callista[i] == Integer.toString(c)){
                        Callista[i] = "X";                      
                  }
                //  System.out.println(Callista[i]);
                }
               // Callista = writeToBoard(c, "X");
                printBoard(Callista); 
            }
            else{

                for(int i = 0; i < 9; i++){
                    if (Callista[i] == Integer.toString(c)){
                        Callista[i] = "O";
                       
                  }
                }
               // Callista = writeToBoard(c, "X");
                printBoard(Callista); 
            }

            isX = !isX;           
            n++;
        }
       user.close();
    }
 } 
