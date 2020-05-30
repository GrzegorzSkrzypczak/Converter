package fxController;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class mainPaneController {

    @FXML
    private Button massButton;

    @FXML
    private Button metricButton;

    @FXML
    private Button exitButton;

    public void initialize () throws Exception {

        massButton.setOnAction (new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) exitButton.getScene ().getWindow ();

                try {
                VBox mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/Mass/massPane.fxml"));
                Scene scene = new Scene (mainPane);

                stage.setScene (scene);
                stage.setTitle ("Wybór-Massy");
                stage.show ();
                stage.setAlwaysOnTop (true);
                stage.setResizable (true);

                } catch (IOException ioException) {
                    ioException.printStackTrace ();

                }
            }
        });

///////////////////////////////////////////////////////////////////////////////////

        exitButton.setOnAction (new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) exitButton.getScene ().getWindow ();
                stage.close ();
            }
        });
    }
}
