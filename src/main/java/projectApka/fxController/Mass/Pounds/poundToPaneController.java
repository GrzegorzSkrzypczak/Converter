package projectApka.fxController.Mass.Pounds;

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

public class poundToPaneController {

    @FXML
    private Button toKgButton;

    @FXML
    private Button toUncjaButton;

    @FXML
    private Button backButton;

    public void initialize() {
        toUncjaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)toUncjaButton.getScene().getWindow();
                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Mass/Pounds/giveNumberPoundsToUncjaPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
//                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/Mass/Pounds/giveNumberPoundsToUncjaPane.fxml"));
                    Scene scene = new Scene (mainPane);
                    stage.setScene (scene);
                    stage.setTitle ("PoundsToUncje");
                    stage.show ();
                    stage.setAlwaysOnTop (true);
                    stage.setResizable (true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


        toKgButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)toKgButton.getScene().getWindow();
                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Mass/Pounds/giveNumberPoundsToKgPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
//                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/Mass/Pounds/giveNumberPoundsToKgPane.fxml"));
                    Scene scene = new Scene (mainPane);
                stage.setScene (scene);
                stage.setTitle ("PoundsToKg");
                stage.show ();
                stage.setAlwaysOnTop (true);
                stage.setResizable (true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });



        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)backButton.getScene().getWindow();

                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Mass/massPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
//                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
                Scene scene = new Scene (mainPane);
                stage.setScene (scene);
                stage.setTitle ("Wybór-opcji");
                stage.show ();
                stage.setAlwaysOnTop (true);
                stage.setResizable (true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });

    }
}
