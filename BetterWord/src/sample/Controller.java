package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;
import org.fxmisc.richtext.InlineCssTextArea;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends Main implements Initializable {

    @FXML
    private InlineCssTextArea typingText;

    int i = 0;
    char space = ' ';

    @FXML
    private void detectInputAreaKeyEvent(KeyEvent event) {
        char[] splitter = textToType.toCharArray();
        System.out.println("index splitter [i] returned: " + splitter[i]);
        System.out.println("event.getText returned: " + event.getText());

//event.getText().equals(textToType.substring(i,i+1)))
            if (event.getText().charAt(0) == splitter[i] && event.getText().charAt(0) != space && event.getText().charAt(0) != nextLine) {
                System.out.println("right letter");
                typingText.setStyle(i, i+1, "-fx-fill: blue;");
                i++;
            } else if (splitter[i] == space && event.getText().charAt(0) == space) {
                System.out.println("char was a space, got it right");
                i++;
            } else if (splitter[i] == nextLine) {
                System.out.println("char was newline, got it right");
                i++;
            } else {
                System.out.println("wrong letter");
            }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("alsodasld" + '\n' + "asdasd");
        typingText.setEditable(false);
        typingText.appendText(textToType);
    }
}
