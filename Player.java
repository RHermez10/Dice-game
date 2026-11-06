public class Player {
    private String name;
    private int points;
    private Die die;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    // Rullar spelarens tärning.
    public void rollDice() {
        die.roll();
    }

    // Returnerar tärningens värde.
    public int getDieValue() {
        return die.getValue();
    }

    // Ökar spelarens poäng med ett.
    public void increaseScore() {
        setPoints(getPoints() + 1);
    }

    // Skapar en ny tärning till spelaren.
    public void addDie(int numberOfSides) {
        die = new Die(numberOfSides);
    }

}
