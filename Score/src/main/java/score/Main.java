package score;

import score.model.GameEntry;
import score.model.Screen;
import score.util.Input;

public class Main {

    public static final int GameEntryQuantity = 3;

    public static void main(String[] args) {
        Screen screen = new Screen();

        for (int i = 0; i < GameEntryQuantity; i++) {
            try {
                String name = Input.getString("Jogador");
                int score = Input.getInt("Score");

                screen.addGameEntry(new GameEntry(name, score));
            } catch (Exception e) {
                System.out.println("Não foi possível adicionar esse GameEntry!");
            }
        }

        screen.showRanking();
    }
}
