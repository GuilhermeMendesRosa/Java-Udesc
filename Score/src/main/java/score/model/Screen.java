package score.model;

import score.util.Output;

import java.util.Set;
import java.util.TreeSet;

public class Screen {

    private final Set<GameEntry> gameEntries = new TreeSet<GameEntry>();

    public void addGameEntry(GameEntry gameEntry) {
        this.gameEntries.add(gameEntry);
    }

    public void showRanking() {
        Output.breakLine();

        int position = 1;
        for (GameEntry gameEntry : this.gameEntries) {
            System.out.printf("%dº: %s%n", position, gameEntry.toString());
            position++;
        }

        Output.breakLine();
    }

}
