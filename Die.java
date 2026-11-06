import java.util.Random;

public class Die {
    private int value;
    private int numberOfSides;
    private static Random random = new Random();

    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int getValue() {
        return value;
    }

    // Slår tärningen och ger ett slumpmässigt värde.
    public void roll() {
        value = random.nextInt(numberOfSides) + 1;
    }

}
