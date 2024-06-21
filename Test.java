import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int flag = 0;
        System.out.println("Enter the number: (greater than 1)");
        int num = obj.nextInt();
        for ( int i = 2; i <= num/2; i++){
            if(num % i == 0){
            flag = 1;
            break;
            }
        }
        if(flag == 1)
        System.out.println("Not a prime number.");
        else System.out.println("Prime number");
    }
    
}
