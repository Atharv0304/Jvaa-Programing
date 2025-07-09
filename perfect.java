import java.util.Scanner;

class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 1;//1
        System.out.println("Enter numbers to check:");
        int b = sc.nextInt();//28
        int count = 0;

        while (a <= b / 2) {//14
            if (b % a == 0) {
                count += a;//1
            }
            a++; 
        }

        System.out.println(count == b ? "Perfect NUM" : "NOT Perfect NUM");

        sc.close();
    }
}
