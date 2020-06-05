package projectApka.fxController.Metrics.Feet;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import projectApka.data.Metrics;


import java.io.File;
import java.io.IOException;
import java.net.URL;

public class giveNumberFeetToYaardController {

    @FXML
    private TextField textButton;

    @FXML
    private Button convertButton;

    @FXML
    private Button backButton;

    Metrics metrics = new Metrics();

    public void initialize() {

        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    double value = Double.parseDouble(textButton.getText());
                    String stringValue = String.valueOf(metrics.feetToYard (value));
                    textButton.setText(stringValue);
                } catch (IllegalArgumentException e) {
                    textButton.setText("Podaj liczbę!!");
                }
            }

        });

        backButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            Stage stage = (Stage)backButton.getScene().getWindow();
            try {
                URL url = new File ("src/main/java/projectApka/fxml/Metrics/Feet/feetToPane.fxml").toURI ().toURL ();
                VBox mainPane = FXMLLoader.load (url);
//                VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/Metrics/Feet/feetToPane.fxml"));
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
    }
}
