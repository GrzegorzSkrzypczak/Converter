package projectApka.fxController;

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

public class mainPaneController {

    @FXML
    private Button massButton;

    @FXML
    private Button metricButton;

    @FXML
    private Button tempButton;

    @FXML
    private Button exitButton;

    public void initialize () throws Exception {

        metricButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)metricButton.getScene().getWindow();

                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Metrics/metricsPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
                   // VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/Metrics/metricsPane.fxml"));

                    Scene scene = new Scene(mainPane);
                    stage.setScene(scene);
                    stage.setTitle("Wybór Odległości");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        massButton.setOnAction (new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) massButton.getScene ().getWindow ();

                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Mass/massPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
//                    VBox mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/Mass/massPane.fxml"));
                    Scene scene = new Scene (mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("Wybór-masy");
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