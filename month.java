import java.util.*; 
class month
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice :\n1.jan\n2.FEB\n3.MAR\n4.APR\n5.MAY\n6.JUNE\n7.JULY\n8.AUG\n9.SEP\n10.ACT\n11.NOV\n12.DEC\n13.EXIT");
        int choice = sc.nextInt();
      
        switch (choice) {
            case 1,3,5,7,8,10,12 -> System.out.println("for choice 1 : "+ 31);
            case 2 -> System.out.println("for choice 2 : "+ 28);
            case 4,6,9,11 -> System.out.println("for choice 4 : "+ 30);
            case 13 -> System.exit(0);
            default -> System.out.println("Invalid choice");
          
        }
        sc.close();
        }
        
        
        
    }
    ;
}