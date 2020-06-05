package projectApka.fxController.Metrics;

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

public class metricsPaneController {

    @FXML
    private Button feetButton;

    @FXML
    private Button metrButton;

    @FXML
    private Button yardButon;

    @FXML
    private Button landMileButton;

    @FXML
    private Button seaMileButton;

    @FXML
    private Button backButton;

    public void initialize() {

        feetButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)feetButton.getScene().getWindow();
                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Metrics/Feet/feetToPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
               //     VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/Metrics/Feet/feetToPane.fxml"));
                    Scene scene = new Scene(mainPane);
                    stage.setScene(scene);
                    stage.setTitle("Stopy na:");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });

        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) backButton.getScene().getWindow();


                try {
                    URL url = new File ("src/main/java/projectApka/fxml/mainPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
//                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Wybór-Opcji");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }
}