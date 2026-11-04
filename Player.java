public class Player {
    private static String name;
    private static int points;
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

    public void setPoint(int points) {
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

}
