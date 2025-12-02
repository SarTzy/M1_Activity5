package Greetings_1st_Activity;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        // Prompt the user to input their first name
        System.out.print("What is your name?: ");
        System.out.println();
        String name = input.next();
        System.out.println("Hello, " + name);
    }
}

