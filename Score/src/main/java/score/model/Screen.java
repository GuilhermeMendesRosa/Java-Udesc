package score.model;

import score.util.Output;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Screen {

    List<GameEntry> gameEntries = new ArrayList<GameEntry>();

    public void addGameEntry(GameEntry gameEntry) {
        this.gameEntries.add(gameEntry);
    }

    public void showRanking() {
        Collections.sort(this.gameEntries);

        Output.breakLine();
        for (int i = 0; i < gameEntries.size(); i++) {
            System.out.printf("%dº: %s%n", i + 1, gameEntries.get(i).toString());
        }
        Output.breakLine();

    }

}
