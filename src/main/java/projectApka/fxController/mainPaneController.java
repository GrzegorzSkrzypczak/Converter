package fxController;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class mainPaneController {

    @FXML
    private Button massButton;

    @FXML
    private Button metricButton;

    @FXML
    private Button exitButton;

    public void initialize () {
        exitButton.setOnAction (new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) exitButton.getScene ().getWindow ();
                stage.close ();
            }
        });
    }
}
