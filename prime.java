import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int a = 2;
        System.out.println("Enter numbers to check:");
        int b = sc. nextInt();
        int count = 0;
        while(a<b/2){
            if(b%a==0){
                count++;
                break;
            }
            a++;
        }

        System.out.println(count==0 ? "PRIME NUM": " NOT PRIME NUM");

        sc.close();
        
    }
    
}