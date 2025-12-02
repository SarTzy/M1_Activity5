package Greetings_1st_Activity;
import java.util.Scanner;

public class Parsing {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter your age: ");
    	System.out.println();
    	String age = input.next();
    		int integer = Integer.parseInt(age);
    			System.out.print("Your age in int:2 " + integer);
    			System.out.println();
    		double doublee = Double.parseDouble(age);
    			System.out.println("Your age in double: " + doublee);
   
}
}
