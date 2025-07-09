import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num :");
        int num = sc.nextInt();
        int j = 1;


        do{
            System.out.println(num*j);
            j++;

        }while(j<=10);
        sc.close();
    }
}
