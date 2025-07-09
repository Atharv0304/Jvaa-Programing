import java.util.*; 
class switc
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice : \n 1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
        int choice = sc.nextInt();
        System.out.println("Enter a 2 number :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Addition is : "+(a+b));
            case 2 -> System.out.println("Addition is : "+(a-b));
            case 3 -> System.out.println("Addition is : "+(a*b));
            case 4 -> System.out.println("Addition is : "+(a/b));
            case 5 -> System.exit(0);
            default -> System.out.println("Invalid choice");
                
               
        
          
        }
        sc.close();
        }
        
        
    }
}