import java.util.Scanner;

class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers:");
        int a = sc.nextInt();//123
        int num =0 ;//1
        while(a>0){
          
          num++;
            
           
            a/=10;//12 2 
          

        }
        System.out.println(" :" +num);
        
        sc.close();
    }
    
}
