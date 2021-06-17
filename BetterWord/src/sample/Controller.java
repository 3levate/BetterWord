package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends Main implements Initializable {

    @FXML
    private TextArea inputArea;

    @FXML
    private TextArea input;

    @FXML
    private Text sixsixsix;

    @FXML
    private StackPane typingArea;

    @FXML
    private void btnClick(ActionEvent event) {
        System.out.println(input.getText());

        if (input.getText().equals("Lorem")) {
            System.out.println(input.getText());
            sixsixsix.setStyle("-fx-fill: red");
        }
        else {
            System.out.println(input.getText() + "failed");
        }
    }

    @FXML
    private void detectInputAreaKeyEvent(KeyEvent event) {
        char[] splitter = textToType.toCharArray();
        for (int i = splitter.length; i < )
        if (event.getText().equals()) {
            System.out.println("working");

        }
        else {
            System.out.println("wrong key");
        }
    }

    @FXML
    private void detectLetterTyped(KeyEvent event) {


    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        input.getScene().setOnKeyPressed((KeyEvent event) -> {
//
//        });
        sixsixsix.setText(textToType);
    }
}
