import java.util.Random;

public class Die {
    private int value;
    private int numberOfSides;
    private static Random random = new Random();

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

    public void roll() {
        value = random.nextInt(numberOfSides) + 1;
    }

}
