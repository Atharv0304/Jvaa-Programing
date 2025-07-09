import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a money u have :");
        int money = sc.nextInt();
        System.out.println("money = " +money );

        if (money>=30 && money<=50) {
            System.out.println("U can Buy only a Pen ");
            
        }
        else if (money>=50) {
            System.out.println("U can Buy both Pen and Pencil ");
            
        }else{
            System.out.println("U dont have money to buy anything");
        }
    

        sc.close();

    }
}
