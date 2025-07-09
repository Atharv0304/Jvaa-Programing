import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b=1;

   
       

        while(b<=a){
            System.out.println(b % 2 == 0 ? b : "");



            b++;


        }
        sc.close();
        
    }
    
}