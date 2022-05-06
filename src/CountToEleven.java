import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        System.out.println("Enter a number less than 11");
        
        Scanner scanner = new Scanner(System.in);
       
        int num = scanner.nextInt();
        
        for(int i = num; i <= 11; i++){
            System.out.println(i);
        }
    }
}