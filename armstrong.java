import java.util.Scanner;

class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int temp=a , count = 0 , result=0;

        while(a>0){
          
          count++;
          a=a/10;
        }
        a=temp;


        while (temp>0) {
            int digit=temp%10;
            result += Math.pow( digit , count);
            temp = temp/10;
        }
        System.out.println(result==a ? "ARMSTRONG NUMBER ": " NOT ARMSTRONG NUMBER");
        
        sc.close();
    }
    
}
