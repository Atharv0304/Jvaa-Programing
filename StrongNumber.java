import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number:");
        int a = sc.nextInt();
        int sum = 0;
        
        int temp = a;
        while (a > 0) {
            int digit = a % 10; 
            int factorial = 1;
            
            while (digit > 1) {
                factorial = factorial * digit;
                digit--;
            }
            
            sum += factorial;
            a /= 10; 
        }
        
        System.out.println(temp == sum ? "STRONG NUMBER" : "NOT STRONG NUMBER");
        
        sc.close();
    }
}
