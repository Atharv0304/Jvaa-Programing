import java.util.*;

class all{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ENTER YOUR CHOICE\n1.ADDITION\n2.SUBSTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.EVEN NUMBER\n6.ODD NUMBER\n7.PRIME NUMBER\n8.PALINDROME NUMBER\n9.TABLE PRINT\n10.ARMSTONG NUMBER\n11.FIBONACCI NUMBER\n12.EXIT");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 :
                System.out.println("Enter a 2 number :");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Addition is : "+(a+b));
                break;
                case 2  :
                System.out.println("Enter a 2 number :");
                int c = sc.nextInt();
                int d = sc.nextInt();
                System.out.println("Substraction is : "+(c-d));
                break;
                case 3 : 
                System.out.println("Enter a 2 number :");
                int e = sc.nextInt();
                int f = sc.nextInt();System.out.println("Multiplication is : "+(e*f));
                break;

                case 4 :
                System.out.println("Enter a 2 number :");
                int g = sc.nextInt();
                int h = sc.nextInt(); System.out.println("Division is : "+(g/h));
                break;

                case 5 :
                System.out.println("Enter numbers:");
                int x = sc.nextInt();
                int y=1;
                while(y<=x){
                    System.out.println(y % 2 == 0 ? y : "");
                    y++;
        
                }
                break;

                case 6 :
                System.out.println("Enter numbers:");
                int p = sc.nextInt();
                int q=1;
                while(q<=p)
                {
                  System.out.println(q % 2 != 0 ? q : "");
                 q++;
                }
                break;

                case 7 :
                int s = 2;
                System.out.println("Enter numbers to check:");
                int t = sc. nextInt();
                int count = 0;
                while(s<t/2){
                if(t%s==0){
                count++;
                break;
                }
                s++;
               }

               System.out.println(count==0 ? "PRIME NUM": " NOT PRIME NUM");
              break;
              
              case 8 :
              System.out.println("Enter numbers:");
              int a1 = sc.nextInt();
      
              int orignal = a1;
      
              int reverse = 0;
              System.out.println("Orignal num :"+a1);
              while(a1>0){
                  int digit =a1%10;
                  reverse = reverse * 10+digit;
                  a1/=10;
      
      
              }
              System.out.println("Reverse num :" +reverse);
      
             System.out.println(orignal==reverse?"it is palindrom num ":" not a palindrom");
             break;

             
             case 9 :

             System.out.println("Enter numbers:");
             int a2 = sc.nextInt();
     
             int b1=1;
     
             while(b1<=10){
                
                 System.out.println(a2*b1);
     
                 b1++;
             }

             break;


             case 10 :
             System.out.println("Enter numbers:");
             int a3 = sc.nextInt();
             int temp=a3 , count1 = 0 , result=0;
     
             while(a3>0){
               
               count1++;
               a3=a3/10;
             }
             a3=temp;
     
     
             while (temp>0) {
                 int digit=temp%10;
                 result += Math.pow( digit , count1);
                 temp = temp/10;
             }
             System.out.println(result==a3 ? "ARMSTRONG NUMBER ": " NOT ARMSTRONG NUMBER");

             break;

            case 11:
    System.out.println("Enter the number of Fibonacci terms:");
    int n = sc.nextInt();

    int first = 0, second = 1, nextTerm;

    for (int i = 1; i <= n; i++) {
        System.out.println(first);
        nextTerm = first + second;
        first = second;
        second = nextTerm;
    }

    System.out.println("END");
    break;



             case 12 : 
             sc.close();
             System.exit(0);
             default : System.out.println("Invalid choice");
                    
                   
            
              
            }
            
            
        }
    }

}