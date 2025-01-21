package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // Display the current local time
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the first binary number
        System.out.print("Enter the first binary number: ");
        String firstBinary = scanner.nextLine();
        Binary binary1 = new Binary(firstBinary);
        System.out.println("First binary number is: " + binary1.getValue());

        // Prompt user for the second binary number
        System.out.print("Enter the second binary number: ");
        String secondBinary = scanner.nextLine();
        Binary binary2 = new Binary(secondBinary);
        System.out.println("Second binary number is: " + binary2.getValue());

        // Menu for operations
        System.out.println("\nSelect an operation:");
        System.out.println("1. OR");
        System.out.println("2. AND");
        System.out.println("3. Multiply");
        System.out.print("Enter the number of the operation (1-3): ");
        int operation = scanner.nextInt();
        
        Binary result = null;

        // Perform the selected operation
        switch (operation) {
            case 1:
                result = Binary.or(binary1, binary2);
                System.out.println("The result of OR operation is: " + result.getValue());
                break;
            case 2:
                result = Binary.and(binary1, binary2);
                System.out.println("The result of AND operation is: " + result.getValue());
                break;
            case 3:
                result = Binary.multiply(binary1, binary2);
                System.out.println("The result of multiplication is: " + result.getValue());
                break;
            default:
                System.out.println("Invalid option! Please enter 1, 2, or 3.");
        }

        // Close scanner to prevent resource leak
        scanner.close();
    }
}
