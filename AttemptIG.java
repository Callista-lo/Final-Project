import java.util.Scanner;

public class AttemptIG {
    

    public static boolean isWinner(String [][] Callista){
        
        if (Callista [0][0] == Callista [1][1] && Callista [0][0] == Callista [2][2]){
            return true;
        }
        if (Callista [0][0] == Callista [1][0] && Callista [0][0] == Callista [2][0]){
            return true;
        }
        if (Callista [0][0] == Callista [0][1] && Callista [0][0] == Callista [0][2]){
            return true;
        }


        if (Callista [0][1] == Callista [1][1] && Callista [0][1] == Callista [2][1]){
            return true;
        }
        if (Callista [0][1] == Callista [0][0] && Callista [0][1] == Callista [0][2]){
            return true;
        }


        if (Callista [0][2] == Callista [1][2] && Callista [0][2] == Callista [2][2]){
            return true;
        }
        if (Callista [0][2] == Callista [1][1] && Callista [0][2] == Callista [2][0]){
            return true;
        }
        if (Callista [0][2] == Callista [0][0] && Callista [0][2] == Callista [0][1]){
            return true;
        }

        
        if (Callista [1][0] == Callista [1][1] && Callista [1][0] == Callista [1][2]){
            return true;
        }
        if (Callista [1][0] == Callista [0][0] && Callista [1][0] == Callista [2][0]){
            return true;
        }


        if (Callista [1][1] == Callista [0][1] && Callista [1][1] == Callista [2][1]){
            return true;
        }
        if (Callista [1][1] == Callista [1][0] && Callista [1][1] == Callista [1][2]){
            return true;
        }
        if (Callista [1][1] == Callista [0][2] && Callista [1][1] == Callista [2][0]){
            return true;
        }
        if (Callista [1][1] == Callista [0][0] && Callista [1][1] == Callista [2][2]){
            return true;
        }


        if (Callista [1][2] == Callista [0][2] && Callista [1][2] == Callista [2][2]){
            return true;
        }
        if (Callista [1][2] == Callista [1][0] && Callista [1][2] == Callista [1][1]){
            return true;
        }

        
        if (Callista [2][0] == Callista [2][1] && Callista [2][0] == Callista [2][2]){
            return true;
        }
        if (Callista [2][0] == Callista [1][0] && Callista [2][0] == Callista [0][0]){
            return true;
        }
        if (Callista [2][0] == Callista [1][1] && Callista [2][0] == Callista [0][2]){
            return true;
        }


        if (Callista [2][1] == Callista [1][1] && Callista [2][1] == Callista [0][1]){
            return true;
        }
        if (Callista [2][1] == Callista [2][0] && Callista [2][1] == Callista [2][2]){
            return true;
        }


        if (Callista [2][2] == Callista [2][1] && Callista [2][2] == Callista [2][0]){
            return true;
        }
        if (Callista [2][2] == Callista [1][2] && Callista [2][2] == Callista [0][2]){
            return true;
        }
        if (Callista [2][2] == Callista [0][0] && Callista [2][2] == Callista [1][1]){
            return true;
        }

        return false;
       
   }

    public static boolean isX(boolean T){
        return !T;
    }

    public static void printBoard(String[][] Board){
  
       System.out.println ("     |   |    ");
       System.out.println ("   " + Board[0][0] + " | " + Board[0][1] + " | " + Board[0][2] + "");
       System.out.println (" ----+---+---- ");
       System.out.println ("   " + Board[1][0] + " | " + Board[1][1] + " | " + Board[1][2] + "");
       System.out.println (" ----+---+---- ");
       System.out.println ("   " + Board[2][0] + " | " + Board[2][1] + " | " + Board[2][2] + "");
       System.out.println ("     |   |    ");

    }

    public static void main(String[] args){  
    
        Boolean boardValue = true;
      String[][] Callista = {{"1", "2", "3"}, { "4", "5", "6"}, {"7", "8", "9"}};

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
        System.out.println ("Please select a number.");
        System.out.println ();
        
        int n = 0;
        Scanner user = new Scanner(System.in);
        while (n < 9){
             String selectedSpot = user.nextLine();

            if (boardValue){
                for(int c = 0; c < 3; c++){
                    for(int i = 0; i < 3; i++)
                    {
                        if (Callista[c][i].equals(selectedSpot)){
                            Callista[c][i] = Callista[c][i].replace(selectedSpot, "X");   
                           // isWinner(Callista, c, i);
                            break;  
                       }  
                    }
                }
            printBoard(Callista);
            
            isWinner(Callista);
                if (isWinner(Callista)){
                    System.out.println("YAY!! You won");
                    break;
                }

            boardValue = isX(boardValue); 
            }
                
            else{
                for(int c = 0; c < 3; c++){
                    for(int i = 0; i < 3; i++)
                    {
                        if (Callista[c][i].equals(selectedSpot)){
                            Callista[c][i] = Callista[c][i].replace(selectedSpot, "O");  
                            break;   
                       }  
                    }
                }
            printBoard(Callista);

            isWinner(Callista);
                if (isWinner(Callista)){
                    System.out.println("YAY!! You won");
                    break;
                }
            boardValue = isX(boardValue);       
            n++;
        }
      // user.close();
    }
 } 


}
