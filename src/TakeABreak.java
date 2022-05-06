import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        System.out.println("Do you want to take a break?");
        
        Scanner scan = new Scanner(System.in);
        
        String input = scan.next();
        
        while  (!input.equals("yes"))
        
        {
            
            System.out.println("Fancy a break mate?");
            input = scan.next();
        }

    }
}
