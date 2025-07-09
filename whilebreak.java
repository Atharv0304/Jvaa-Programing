import java.util.Scanner;

public class whilebreak {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = 0;
        System.out.println("Enter a num to print table :");
        int table = sc.nextInt();
        int count = sc.nextInt();
        int tableprint =0;


        do{
            System.out.println(table*num);
            num++;


             if (table==3) {
                table++;
                num=0;
                continue;
                
                
            }


            if (num>10) {
                num=0;
                table++;
                tableprint++;
                System.out.println("---");
                
                
            }
           
            if (tableprint==count) {
                break;
                
            }
        }while(true);
        sc.close();

        
    }
}
