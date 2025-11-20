/*
Challenge 1 — Encapsulation & Access Control
Instructions:
Create a class called Player with:
    private attributes:
        name (String), health (int), energy (int)

        a constructor that sets all attributes

        getter methods for all attributes

        a method takeDamage(int amount) that reduces health

        if health drops below 0, set it to 0

        a method isAlive() that returns true if health > 0
    Constraints (competition style):
        No printing in methods except for debugging (not needed here)

        Must maintain clean encapsulation

        No negative numbers allowed for damage; if amount < 0, ignore it
Goal:
    In the main method, create two players, make one attack the other, and print who is alive.
*/
package Topic_5.Challenge_1;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Alice", 100, 50);
        Player player2 = new Player("Bob", 80, 60);
        player2.takeDamage(30);
        System.out.println(player1.getName() + " is alive: " + player1.isAlive());
        System.out.println(player2.getName() + " is alive: " + player2.isAlive());
    }
}
