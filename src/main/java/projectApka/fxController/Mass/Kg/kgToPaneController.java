package projectApka.fxController.Mass.Kg;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

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

                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Mass/Kg/giveNumberKgToUncjaPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
                  //  VBox mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/Mass/Kg/giveNumberKgToUncjaPane.fxml"));
                    Scene scene = new Scene (mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("KgToUcja");
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

                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Mass/Kg/giveNumberKgToPundsPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
//                    VBox mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/Mass/Kg/giveNumberKgToPundsPane.fxml"));
                    Scene scene = new Scene (mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("KgtoPounds");
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


                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Mass/massPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
//                    VBox mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/mainPane.fxml"));
                    Scene scene = new Scene (mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("Wybór-Opcji");
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


