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

    // Returnerar värdet på spelarens tärning som ett heltal.
    public int getDieValue() {
        return die.getValue();
    }

    // Ökar spelarens poäng med ett.
    public void increaseScore() {
        points++;
    }

    public void addDie(int numberOfSides) {
        die = new Die(numberOfSides);
    }

}
