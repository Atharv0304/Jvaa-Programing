import java.util.*; 
class week
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice :\n1.1\n2.2\n3.3\n4.4\n5.5\n6.6\n7.7\n8.Exit");
        int choice = sc.nextInt();
      
        switch (choice) {
            case 1 -> System.out.println("for choice 1 : "+ "Sunday");
            case 2 -> System.out.println("for choice 2 : "+ " MONDAY");
            case 3 -> System.out.println("for choice 3: "+ "TUESDAY");
            case 4 -> System.out.println("for choice 4 : "+ " WEDNEDAY");
            case 5 -> System.out.println("for choice 5 : "+ " THUESDAY");
            case 6 -> System.out.println("for choice 6 : "+ " FRIDAY");
            case 7 -> System.out.println("for choice 7 : "+ " SATURDAY");
            case 8 -> System.exit(0);
           
            default -> System.out.println("Invalid choice");
                
               
        
          
        }
        sc.close();
        }
        
        
    }
}