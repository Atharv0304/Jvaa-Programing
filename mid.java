import java.util.*; 
class mid
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mid= a>b&&a<c || a<b&&a>c ?a: b>a&&b<c || b<a&&b>c ?b : c;

        // if ((a > b && a < c) || (a < b && a > c)) {
        //     mid = a;
        // } else if ((b > a && b < c) || (b < a && b > c)) {
        //     mid = b;
        // } else {
        //     mid = c;
        // }
        
        System.out.println("Middle number is: " + mid);
        sc.close();
    }
    
}