package projectApka.dataViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class JavaFXViewController extends Application implements Runnable {

    

    @Override
    public void start(Stage stage) throws Exception {

        URL url = new File ("src/main/java/projectApka/fxml/mainPane.fxml").toURI ().toURL ();
        VBox mainPane = FXMLLoader.load (url);
Scene scene = new Scene (mainPane);
        stage.setScene (scene);
        stage.setTitle ("Start / Wybór opcji");
        stage.show ();
        stage.setAlwaysOnTop (true);
        stage.setResizable (true);
    }

    @Override
    public void run() {
        launch ();
    }
}
