import java.util.Scanner;

public class Charge
{
    public static void main (String[] args) {
        double prevBal;
        double charge;
        double newBal;
        double interest = 1.02;
        double minPay = 0;
        
        
        Scanner scan = new Scanner(System.in); 
            
        System.out.print ("Enter your previous balance:");
        prevBal = scan.nextDouble();
        System.out.print ("Enter your current charges:");
        charge = scan.nextDouble();
        if (prevBal <= 0) {
            interest = 0;
        }
        
        newBal = ((prevBal + charge) * interest);
        
        if (newBal < 50) {
            minPay = newBal;
        } else if (newBal >= 50 && newBal <= 300) {
            minPay = 50;
        } else if (newBal > 300) {
            minPay = newBal * (0.2);
        }
        
        
        System.out.println();
        System.out.println("CS CARD International Statement");
        System.out.println("================================\n");
        
        System.out.println("Previous Balance:\t$" + prevBal);
        System.out.println("Additional Charges:\t$" + charge);
        System.out.println("Interest:\t\t$" + (newBal - (prevBal + charge)) + "\n");
        
        System.out.println("New Balance:\t\t$" + newBal + "\n");
        
        System.out.println("Minimum Payment:\t$" + minPay );
        
        
        
    }
}