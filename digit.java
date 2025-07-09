import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers:");
        int a = sc.nextInt();

        
        System.out.println("Orignal num :"+a);
        while(a>0){
            int digit =a%10;
            System.out.println(digit);
            a/=10;




        }
        sc.close();
        
    }
    
}