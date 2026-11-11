import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nWelcome to the Dice Game! \n...Lets get ready to roll!...");

        System.out.println("\nWhat's your name?");
        Player player = new Player(scanner.nextLine());

        System.out.println("\nChoose the number of sides for your dice.");

        player.addDie(scanner.nextInt()); // Lägger till en tärning med värdet som användaren anger.

        System.out.println("\nEnter the number of rounds you want to play....");
        int round = scanner.nextInt();

        System.out.println("\nGame started!");

        for (int i = 1; i <= round; i++) {
            System.out.println("ROUND " + i + ":");
            System.out.println("\nGuess a number 1 - " + player.getNumberOfSidesValue());
            int guess = scanner.nextInt();

            while (guess < 1 || guess > player.getNumberOfSidesValue()) {
                System.out.println(
                        "Invalid guess. Please enter a number between 1 and " + player.getNumberOfSidesValue() + ".");
                guess = scanner.nextInt();
            }
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