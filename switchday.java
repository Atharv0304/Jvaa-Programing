import java.util.Scanner;
public class switchday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        while (true) {
            System.out.println("\nEnter a day (number): 1.Monday  2.Tuesday  3.Wednesday  4.Thursday  5.Friday  6.Saturday  7.Sunday  0.Exit");

            int day = sc.nextInt();

            if (day == 0) {
                System.out.println("Exit from program");
                break;
                
            }

            switch (day) {
                case 1,6 -> System.out.println("WFO");
                    
                
                    case 2 -> System.out.println("WFH");
                    

                    case 3,5 -> System.out.println("HOLIDAY");
      
                    case 4,7 -> System.out.println("MEETING");
        

                
            
                default -> System.out.println("NO SHEDULE...Enter from 0-7");
                
            }

        }
        sc.close();
    }

}
