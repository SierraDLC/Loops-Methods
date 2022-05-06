import java.util.Scanner;

public class StopAtFive {
    
    public static void main(String[] args) {
       
        System.out.println("Give a number");
        Scanner scan = new Scanner(System.in);
        int numz = scan.nextInt();
       
        
        while(numz != 5){
            
            System.out.println(" Keep em coming");
            numz = scan.nextInt();
        }
    }
}
