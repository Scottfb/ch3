import java.util.Scanner;

public class Palindrome
{
   public static void main(String[] Args) {
       String word; 
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter a word to see if it's a Palindrome");
       word = scan.next();
       
       for (int i = word.length(); i > 0; --i) {
       if ((word.substring(0,1)).equals(word.substring(word.length() - 1), word.length())) {
           System.out.println("dope");
       }
       System.out.println(word.substring(0,1));
    }
}
}