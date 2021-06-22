package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;
import org.fxmisc.richtext.InlineCssTextArea;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

public class Controller extends Main implements Initializable {

    @FXML
    private InlineCssTextArea typingText;

    int i = 0;
    char space = ' ';
    String textTypeAllWords = "";
    char[] splitter2;

    @FXML
    private void detectInputAreaKeyEvent(KeyEvent event) {

        System.out.println(textTypeAllWords);
//        char[] splitter = textToType.toCharArray();
        System.out.println(splitter2[1]);
        System.out.println("index splitter [i] returned: " + splitter2[i]);
        System.out.println("event.getText returned: " + event.getText());

//event.getText().equals(textToType.substring(i,i+1)))
            if (event.getText().charAt(0) == splitter2[i] && event.getText().charAt(0) != space && event.getText().charAt(0) != nextLine) {
                System.out.println("right letter");
                typingText.setStyle(i, i+1, "-fx-fill: red;");
                i++;
            } else if (splitter2[i] == space && event.getText().charAt(0) == space) {
                System.out.println("char was a space, got it right");
                i++;
            } else if (splitter2[i] == nextLine) {
                System.out.println("char was newline, got it right");
                i++;
            } else {
                System.out.println("wrong letter");
            }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        List<String> strList = Arrays.asList(textTypeArray);
        Collections.shuffle(strList);
        strList.toArray(textTypeArray);
        for (String n: textTypeArray) {
            textTypeAllWords += n;
            splitter2 = textTypeAllWords.toCharArray();
        }
//        for (int b = 0; b < textTypeArray.length; b++) {
////            textTypeOneWord = textTypeArray[b];
////            splitter2 = textTypeOneWord.toCharArray();
//            splitter2 = textTypeArray.toString().toCharArray();
//        }
        for (int a = 0; a < textTypeArray.length; a++) {
            typingText.appendText(textTypeArray[a]);
        }
        typingText.setEditable(false);
    }
}
