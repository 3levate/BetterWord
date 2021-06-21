package sample;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class Main extends Application {

    @FXML private StackPane typingArea;

    @FXML
    private Text sixsixsix;

    String textToType = "test";

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        root.getStylesheets().add("package/css1.css");

        primaryStage.setTitle("BetterWord");
        Scene scene = new Scene(root, 1920, 1080);

        primaryStage.setScene(scene);
        primaryStage.show();

//        typingArea.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
//
//            @Override
//            public void handle(KeyEvent keyEvent) {
//
//                System.out.println("working from controller");
//            }
//        });
//        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent keyEvent) {
//                if (keyEvent.getText().equals("t")) {
//                    System.out.println("right letter pressed");
//                    sixsixsix.setStyle("-fx-fill: blue");
//                }
//                else {
//                    System.out.println("other letter was pressed");
//                }
//            }
//        });


    }


    public static void main(String[] args) {
        launch(args);
    }
}
