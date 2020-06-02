module UnitedWorkingStation {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    exports ProjectApka to javafx.graphics;
    opens  ProjectApka.controller to javafx.fxml;

}