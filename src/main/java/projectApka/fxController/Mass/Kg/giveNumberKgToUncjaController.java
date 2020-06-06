package fxController.Mass.Kg;


import data.Mass;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;
import java.net.URL;

public class giveNumberKgToUncjaController {

    @FXML

    private TextArea textAreaButton;

    @FXML
    private Button convertButton;

    @FXML
    private Button backButton;

    Mass mass = new Mass ();


    public void initialize() throws Exception {

        convertButton.setOnAction (new EventHandler<ActionEvent> () {

            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    double value = Double.parseDouble(textAreaButton.getText());
                    String stringValue = String.valueOf(mass.kilogramToUncja (value));
                    textAreaButton.setText(stringValue);
                } catch (IllegalArgumentException e) {
                    textAreaButton.setText("Podaj liczbę!!");
                }
            }

        });

///////////////////////////////////////////////////////////////////////////////////

        backButton.setOnAction (new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) backButton.getScene ().getWindow ();

                Stage massStage = new Stage ();


                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Mass/Kg/kgToPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
//                    VBox mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/Mass/Kg/kgToPane.fxml"));
                    Scene scene = new Scene (mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("Kg-Wybor");
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
