package projectApka.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CalcPaneController {

    @FXML
    private Button massLabel;

    @FXML
    private Button metricLabel;

    @FXML
    private Button tempLabel;

    @FXML
    private Button exitLabel;


    public void initialize() {

exitLabel.setOnAction (new EventHandler<ActionEvent> () {

    @Override
    public void handle(ActionEvent actionEvent) {
        Stage stage = (Stage) exitLabel.getScene ().getWindow ();
        stage.close ();
    }
});
    }
}
