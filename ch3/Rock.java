// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        String result = "";                      
                              
        Random generator = new Random();
        
        //Get player's play -- note that this is stored as a string
        System.out.println("Enter your play: ");
        Scanner scan = new Scanner(System.in);
        personPlay = scan.next();
        
        //Make player's play uppercase for ease of comparison
        
        personPlay = personPlay.toUpperCase();
        
        //Generate computer's play (0,1,2)
        
        computerInt = generator.nextInt(3);
        
        //Translate computer's randomly generated play to string
        
        if (computerInt == 0) {
            computerPlay = "R";
        } else if (computerInt == 1) {
            computerPlay = "P";
        } else if (computerInt == 2) {
            computerPlay = "S";
        }
        
        //Print computer's play
        
        System.out.println("The computer played " + computerPlay);
        
        //See who won.
        
        if (computerPlay.equals(personPlay)) {
            result = "Tie";
        } 
        if (computerPlay.equals("R") && personPlay.equals("S")) {
            result = "You Lost";
        }
        if (computerPlay.equals("P") && personPlay.equals("R")) {
            result = "You Lost";
        }
        if (computerPlay.equals("S") && personPlay.equals("P")) {
            result = "You Lost";
        }
        if (computerPlay.equals("R") && personPlay.equals("P")) {
            result = "You Won";
        }
        if (computerPlay.equals("P") && personPlay.equals("S")) {
            result = "You Won";
        }
        if (computerPlay.equals("S") && personPlay.equals("R")) {
            result = "You Won";
        }
        System.out.println(result);
        double z = 5/10;
        System.out.print(z);
    }
}
