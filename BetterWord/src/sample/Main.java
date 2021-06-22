package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    char nextLine = '\n';
    String textToType =
            "as " + "his " + "that " + "he " + "was " + "for " + "on " + "are " + "with " + "they " + "be " + "at " + "one " + "have " + "this " + "from " + "by " + "hot " + "word " + "but " + nextLine +
            "what " + "some " + "is " + "it " + "you " + "or " + "had " + "the " + "of " + "to " + "and " + "a " + "in " + "we " + "can " + "out " + "other " + "were " + "which " + "do " + "their " + nextLine +
            "time " + "if " + "will " + "how " + "said " + "an " + "each " + "tell " + "does " + "set " + "three " + "want " + "air " + "well " + "also " + "play " + "small " +"end " + "put " + nextLine +
            "home " + "read " + "hand " + "port " + "large " + "spell " + "add " + "even" + "land " + "here " + "must " + "big " + "high " + "such " + "follow " + "act " + "why " + "ask " + nextLine +
            "men " + "change " + "went " + "light " + "kind " + "off " + "need " + "house " + "picture " + "try " + "us " + "again " + "animal " + "point " + "mother " + "world " + nextLine +
            "near " + "build " + "self " + "earth " + "father";

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.getStylesheets().add("sample/css1.css");

        primaryStage.setTitle("BetterWord");
        Scene scene = new Scene(root, 1920, 1010);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
