import java.util.Random;

public class Die {
    private static int value;
    private static int numberOfSides = 6;
    private static Random random;

    // constructor
    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    // getter Method
    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int getValue() {
        return value;
    }

    public static void roll() {
        random = new Random();
        value = random.nextInt(numberOfSides) + 1;
        System.out.println("The value of the die is: " + value);

    }

}
