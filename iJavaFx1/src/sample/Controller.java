package sample;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Controller {
    @FXML private Labeled labelSaludo;
    @FXML private TextField textField;

    @FXML private void onButtonAction(ActionEvent actionEvent){
        String nombre = textField.getText();
        labelSaludo.setText("Hola"+nombre);
    }
}
