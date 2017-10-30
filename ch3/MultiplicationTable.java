
public class MultiplicationTable
{
    public static void main(String[] Args) {
        int num1 = 1;
        for (int y = 1; y <= 12; ++y) {
                for (int x = 1; x <= 12; ++x) {
                if (x <= 12) {
                    System.out.print(y * x + " ");
                } 
            }
            System.out.print("\n");
        }
    }
}
