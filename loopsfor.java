import java.util.Scanner;

public class loopsfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print value");

        int num = sc.nextInt();
        int a= 1;

       for(int i = a; i<=10;i++){
        System.out.println(num*i);
       }

        sc.close();
    }
}
