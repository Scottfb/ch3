// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
          
 
          //randomly generate the  number to guess
          
          numToGuess = generator.nextInt(11);
 
          //print message asking user to enter a guess
          
          System.out.println("Enter in a guess!");
          guess = scan.nextInt();
          

          //read in guess
                    
          while (guess != numToGuess)  //keep going as long as the guess is wrong
            {
                  //print message saying guess is wrong
                  System.out.println("That guess isn't correct. Try again");
                  //get another guess from the user
                  guess = scan.nextInt();
                  
          }
 
          //print message saying guess is right
          if (guess == numToGuess) {
              System.out.println("Congrats! You guessed the number correctly");
            }
        }
}
 