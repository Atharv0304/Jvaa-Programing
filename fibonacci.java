import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b=1;
        int first = 0 , secound = 1 , third = 0;

        while(b<=a){
           System.out.println(first);
           third = first+secound;
           first=secound;
           secound=third;
            b++;

        }
        System.out.println("END");
       
        sc.close();
    }
    
}
