package PracticeMethods;

public class DivideMethod {
    
    public static void divide (int num1, int num2){
        
        System.out.println(num1 + " / " + num2 + " = " + (double) num1 / (double) num2);
    }

    public static void main(String[] args) {
        divide(1, 3);
    }
}