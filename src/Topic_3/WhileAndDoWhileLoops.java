/*
Exercise 4 – while and do‑while Loops (Number‑Guessing Game)

Task

    Generate a random integer between 1 and 500.
    Give the user 10 attempts to guess the secret number.
    After each guess, tell the user whether the secret number is higher or lower.
    Use a while loop to limit the number of attempts.
    Use a do‑while loop to validate that the user’s input is a valid integer (repeat the prompt until a proper number is entered).

When the game ends, indicate whether the user won or lost and how many attempts were used.

What you’ll practice

    Random number generation (Random or Math.random()).
    Controlling attempts with a while loop.
    Input validation with a do‑while loop.

 */
package Topic_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.nio.Buffer;


public class WhileAndDoWhileLoops {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int randomNumber = (int)(Math.random() * 500) + 1;
        System.out.println(randomNumber);
        int attempts = 10;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (attempts > 0) {
            System.out.println("Try to gess the secret number between 1 an 500, you have 10 attempts");
            int userGess = Integer.parseInt(br.readLine());
            
        }        
    }
    
}
