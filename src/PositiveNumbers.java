import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args) {
        
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        
        
        int numz = scan.nextInt();
        
        while(numz != 0) {
            
            if(numz < 0){
            
                System.out.println("Number must be a positive number");
            } else {
                System.out.println("Number is " + numz);
            }
            
            System.out.println("Enter a number: "); numz = scan.nextInt();
        }
    }
}