import java.util.Scanner;

public class loopswhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print value");

        int num = sc.nextInt();
        int a= 1;

        while (a<=10) {
            
            System.out.println(num*a);
            ++a;
        }
        sc.close();
    }
}
