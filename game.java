
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int myNumber = (int)(Math.random()*100);
        int userNumber ;

        do{
            System.out.println("Guess My Number (1 - 100)");
            userNumber = sc.nextInt();


            if(userNumber == myNumber){
                System.out.println("WHOOOO..HOOOO GONGRATES U WON THE GAME");
            }
            else if(userNumber > myNumber){
                System.out.println("Your number is to large");
            }
            else{
                System.out.println("Your number is to small");
            }
        }while(myNumber >= 0); 
        System.out.println("MY NUMBER WAS : "+ myNumber);
        sc.close();

    }
}
