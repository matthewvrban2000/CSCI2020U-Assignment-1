package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        boolean[] cards = new boolean[52];
        // choose 3 random distinct cards from the deck
        int count = 0;
        while (count < 3) {
            int card = (int) (Math.random() * 52);
            if (!cards[card]) {
                cards[card] = true;

                pane.add(new ImageView(new Image("sample/image/"+(++card)+".png",100, 100, false, false)), count, 0);
                count++;
            }
        }
        Scene scene = new Scene(pane, 500, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }


}
