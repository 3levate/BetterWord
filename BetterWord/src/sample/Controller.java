package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextArea inputArea;

    @FXML
    private TextArea input;

    @FXML
    private Text sixsixsix;

    @FXML
    private void btnClick(ActionEvent event) {
        System.out.println(input.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
