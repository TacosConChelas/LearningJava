/*
Challenge 1 — Conditional Method Logic

Description:
    Create a method gradeLevel(int score) that returns a String following these rules:
        score < 60 → "Fail"
        60–79 → "Pass"
        80–89 → "Good"
        ≥ 90 → "Excellent"
Call the method with 5 different values and print each result.
Goal: Use methods + control flow + return values efficiently.
 * 
 */
package Topic_4;

public class ConditionalMethodLogic {
    public static void main(String[] args) {
        System.out.println(gradeLevel(55));  // Fail
        System.out.println(gradeLevel(65));  // Pass
        System.out.println(gradeLevel(85));  // Good
        System.out.println(gradeLevel(95));  // Excellent
        System.out.println(gradeLevel(75));  // Pass    
    }
    /*
    @param score init: es le valor q se va a evaluar y dependiendo de este será lo que @return
    regrese
    @return String: "Fail", "Pass", "Good", "Excellent" dependiendo del valor de score
     */
    public static String gradeLevel(int score){
        if (60 >= score && score <= 79){
            return "Pass";
        } else if (80 >= score && score <= 89){
            return "Good";
        } else if (score >= 90){
            return "Excellent";
        }
        return "Fail";
    }   
}
