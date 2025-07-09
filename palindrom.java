import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers:");
        int a = sc.nextInt();

        int orignal = a;

        int reverse = 0;
        System.out.println("Orignal num :"+a);
        while(a>0){
            int digit =a%10;
            reverse = reverse * 10+digit;
            a/=10;


        }
        System.out.println("Reverse num :" +reverse);

       System.out.println(orignal==reverse?"it is palindrom num ":" not a palindrom");
       sc.close();
    }
    
}