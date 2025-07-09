import java.util.Scanner;

public class dowhilegame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;

        do{
            System.out.println("Enter a number :");
            number = sc.nextInt();
            System.out.print("Here is your number : ");
            System.out.println(number);
        }while(number>=0);
        

        System.out.println("THE END");
        sc.close();
    }
}
