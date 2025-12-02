package Greetings_1st_Activity;
import java.util.Scanner;

public class Arithmitic {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
    	
   
    	int sum = num1 + num2;
    	int difference = num1 - num2;
    	int product  = num1 * num2;
    	
    	System.out.println("sum= " + sum);
    	System.out.println("difference= " + difference);
    	System.out.println("product= " + product);
    	
}
}
