import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        
        System.out.println("What's your number? : ");
        
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            
            int numz = scan.nextInt();
            
            for (int i = 1; i <= 10; i++) {
                
                System.out.println(numz + " x " + i + " = " + (numz*i));
            }
        }
    }
}