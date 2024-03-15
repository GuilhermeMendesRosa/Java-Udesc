package score.model;

public class GameEntry implements Comparable<GameEntry> {

    private final String name;
    private final int score;

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("Jogador: %s - Score: %d", this.name, this.score);
    }

    @Override
    public int compareTo(GameEntry gameEntryToCompare) {
        return Integer.compare(gameEntryToCompare.getScore(), this.score);
    }

}
