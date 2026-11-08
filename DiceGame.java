import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        int round;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nWelcome to the Dice Game! \n...Lets get ready to roll!...");

        System.out.println("\nWhat's your name?");
        String name = scanner.nextLine();
        Player player = new Player(name);

        System.out.println("\nChoose the number of sides for your dice.");

        player.addDie(scanner.nextInt()); // Lägger till en tärning med värdet som
        // användaren anger.

        System.out.println("\nEnter the number of rounds you want to play....");
        round = scanner.nextInt();

        System.out.println("\nGame started!");

        for (int i = 1; i <= round; i++) {
            System.out.println("ROUND " + i + ":");
            System.out.println("\nGuess a number.... ");
            int guess = scanner.nextInt();
            player.rollDice();

            if (guess == player.getDieValue()) {
                System.out.println(" \nCorrect you earned a point.");
                player.increaseScore();

            } else {
                System.out.println(" \nYou guessed wrong!");
                System.out.println("The correct value is " + player.getDieValue() + ".");
            }
        }

        scanner.close();
        System.out.println("\n The Game Has Ended.");
        System.out.println("\nPlayer: " + player.getName() + ", Points Collected: " + player.getPoints());

    }
}