/*
Exercise 2 – Multiple‑Choice Selection (switch)

Task
Create an interactive menu that lets the user choose an operation on two integers x and y:
Option	Action
1	Add (x + y)
2	Subtract (x - y)
3	Multiply (x * y)
4	Divide (x / y) – handle division‑by‑zero gracefully
5	Exit

Use a switch statement to process the selected option. The menu should keep appearing until the user chooses “Exit”.

What you’ll practice

    switch with case and default.
    Looping with while to repeat the menu.
    Simple error handling (division by zero).
 */
package Topic_3;

import java.util.Scanner;

public class MultipleChoiseSelection {
    public static void main(String[] args) {
        String message = ("Choose an option:" + 
                "\n1) Add" +
                "\n2) Subtract" +
                "\n3) Multiply" +
                "\n4) Divide" +
                "\n5) Exit");    
        try (Scanner sc = new Scanner(System.in)){
            final int option = readIntegerInput(sc, message);
            final int number1 = readIntegerInput(sc, "Enter the first integer number:");
            final int number2 = readIntegerInput(sc, "Enter the second integer number:");
            switch (option) {
                case 1 -> System.out.println("The result of addition is: " + (number1 + number2));
                case 2 -> System.out.println("The result of subtraction is: " + (number1 - number2));
                case 3 -> System.out.println("The result of multiplication is: " + (number1 * number2));
                case 4 -> {
                    if (number2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("The result of division is: " + ((double) number1 / number2));
                    }
                }
                case 5 -> System.out.println("Exiting the program.");
                default -> System.out.println("Invalid option. Please choose a valid option.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }    
    }
    /*
    @param sc Scanner object for reading input
    @param promptString String to prompt the user
    @return int Validated integer input from the user
     */
    public static int readIntegerInput(Scanner sc, String promptString){
        System.out.println(promptString);
        while(!sc.hasNextInt()){
            System.out.println("Invalid input, you have to enter a integer number");
            sc.next();
            System.out.println(promptString);
        }
        return sc.nextInt();
    }

}
