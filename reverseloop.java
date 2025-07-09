import java.util.Scanner;
public class reverseloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print value");

        int num = sc.nextInt();
        int a= 10;

       for(int i = a; i>=1;i--){
        System.out.println(num*i);
       }

        sc.close();
    }
}
