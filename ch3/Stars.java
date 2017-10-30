public class Stars
{
    public static void main(String[] Args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        }
    public static void pattern1() {
        for (int stars = 10; stars > 0; --stars) {
                for (int x = stars; x > 0; --x) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void pattern2() {
       int stars = 1;
       int spaces = 9;
       for (int i = 0; i < 10; ++i) {
           for (int x = spaces; x > 0; --x) {
               System.out.print(" ");
            }
           for (int y = stars; y > 0; --y) {
               System.out.print("*");
            }
           stars += 1;
           spaces -= 1;
           System.out.print("\n");
        }
       System.out.print("\n");
    }
    public static void pattern3() {
       int stars = 10;
       int spaces = 0;
       for (int i = 0; i < 10; ++i) {
           for (int x = spaces; x > 0; --x) {
               System.out.print(" ");
            }
           for (int y = stars; y > 0; --y) {
               System.out.print("*");
            }
           stars -= 1;
           spaces += 1;
           System.out.print("\n");
        }
       System.out.print("\n");
    }
    public static void pattern4() {
       int stars = 1;
       int spaces = 4;
       for (int i = 0; i < 5; ++i) {
           for (int x = spaces; x > 0; --x) {
               System.out.print(" ");
            }
           for (int y = stars; y > 0; --y) {
               System.out.print("*");
            }
           for (int z = spaces; z > 0; --z) {
               System.out.print(" ");
            }
           stars += 2;
           spaces -= 1;
           System.out.println();
        }
       int newStars = 9;
       int newSpaces = 0;
       for (int i = 0; i < 5; ++i) {
           for (int x = newSpaces; x > 0; --x) {
               System.out.print(" ");
            }
           for (int y = newStars; y > 0; --y) {
               System.out.print("*");
            }
           for (int z = newSpaces; z > 0; --z) {
               System.out.print(" ");
            }
           newStars -= 2;
           newSpaces += 1;
           System.out.println();
        }
    }
}
