import java.util.Scanner;
public class Swap {
   public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter two number: ");
    int a = ob.nextInt();
    int b = ob.nextInt();
    System.out.println("a = "+a+", b = "+b);
    int c;
    c = a;
    a = b;
    b = c;
    System.out.println("After swaping : a = "+a+", b = "+b);
   } 
}
