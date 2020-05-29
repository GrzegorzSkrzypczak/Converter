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

public class kgToPaneController {

    @FXML
    private Button toPoundsButton;

    @FXML
    private Button toUncjaButton;

    @FXML
    private Button backButton;


    public void initialize() throws Exception {

        toUncjaButton.setOnAction (new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) toUncjaButton.getScene ().getWindow ();

                Stage massStage = new Stage ();


                try {
                    VBox mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/giveNumberKgToUncjaPane.fxml"));
                    Scene scene = new Scene (mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("Konwerter");
                    stage.show ();
                    stage.setAlwaysOnTop (true);
                    stage.setResizable (true);
                } catch (IOException e) {
                    e.printStackTrace ();
                }

            }
        });

        ///////////////////////////////////////////////////////////////////////////////////

        toPoundsButton.setOnAction (new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) toPoundsButton.getScene ().getWindow ();

                Stage massStage = new Stage ();


                try {
                   VBox mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/giveNumberKgToPundsPane.fxml"));
                    Scene scene = new Scene (mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("Konwerter");
                    stage.show ();
                    stage.setAlwaysOnTop (true);
                    stage.setResizable (true);
                } catch (IOException e) {
                    e.printStackTrace ();
                }

            }
        });

///////////////////////////////////////////////////////////////////////////////////

        backButton.setOnAction (new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) backButton.getScene ().getWindow ();

                Stage massStage = new Stage ();

                VBox mainPane = null;
                try {
                    mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/massPane.fxml"));
                    Scene scene = new Scene (mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("Konwerter");
                    stage.show ();
                    stage.setAlwaysOnTop (true);
                    stage.setResizable (true);
                } catch (IOException e) {
                    e.printStackTrace ();
                }

            }
        });
    }
}


