package projectApka.fxController.Mass;

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

public class massPaneController {

    @FXML
    private Button kgButton;

    @FXML
    private Button poundsButton;

    @FXML
    private Button uncjeButton;

    @FXML
    private Button backButton;


    public void initialize() {

        uncjeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)uncjeButton.getScene().getWindow();

                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Mass/Uncja/uncjaToPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
    //                VBox mainPane = FXMLLoader.load(getClass ().getClassLoader ().getResource ("/fxml/mainPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Uncja-Wybór");
                    stage.show();
                    stage.setResizable(true);
                    stage.setAlwaysOnTop(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        poundsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)poundsButton.getScene().getWindow();
                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Mass/Pounds/poundToPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
//                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/Mass/Pounds/poundToPane.fxml"));
                    Scene scene = new Scene(mainPane);
                    stage.setScene(scene);
                    stage.setTitle("Funt-Wybór");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });


        kgButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) kgButton.getScene().getWindow();

                try {
                    URL url = new File ("src/main/java/projectApka/fxml/Mass/Kg/kgToPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
                  //  VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/Mass/Kg/kgToPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Kg-Wybór");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

///////////////////////////////////////////////////////////////////////////////////

        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) backButton.getScene().getWindow();


                try {
                    URL url = new File ("src/main/java/projectApka/fxml/mainPane.fxml").toURI ().toURL ();
                    VBox mainPane = FXMLLoader.load (url);
                  //  VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
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

