package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextArea inputArea;

    @FXML
    private Text sixsixsix;

    public void initialize() {
        System.out.println(inputArea);
        if (inputArea.charAt() == sixsixsix.getText()) {
            sixsixsix.setStroke(Color.BLUE);
            System.out.println(inputArea);
        }
        System.out.println(inputArea);
    }
}
