module UnitedWorkingStation {
    requires javafx.fxml;
<<<<<<< HEAD
    requires javafx.graphics;
    requires javafx.controls;

    exports ProjectApka to javafx.graphics;
    opens  ProjectApka.controller to javafx.fxml;
=======
    requires javafx.controls;
    requires javafx.graphics;
    requires java.desktop;
    opens fxController to javafx.fxml;



>>>>>>> favael
}