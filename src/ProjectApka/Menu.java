package ProjectApka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;


public class Menu extends Application {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        scanner = new Scanner(System.in);
//        wyborOpcji();
launch (args);

    }

    private static void printOptions() {
        System.out.println("Wybierz opcję: ");
        for (Opcje option : Opcje.values()) {
            System.out.println(option.optionNumber
                    + ": " + option
                    + " - " + option.desciprion);
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox calcPane = FXMLLoader.load (getClass ().getResource ("fxml/CalcPane.fxml"));
        Scene scene = new Scene (calcPane);
        stage.setScene (scene);
        stage.setTitle ("Przelicznik");
        stage.show ();
        stage.setAlwaysOnTop (true);
        stage.setResizable (true);

    }


    private enum Opcje {

        MASS(1, "Przeliczenie wagi."),
        METRICS(2, "Przeliczenie pomiarów."),
        TEMPERATURE(3, "Przeliczenie temperatury."),
        EXIT(4, "Wyjście.");

        public int optionNumber;
        public String desciprion;


        Opcje(int optionNumber, String desciprion) {
            this.optionNumber = optionNumber;
            this.desciprion = desciprion;

        }
    }


    public static void wyborOpcji() {

        Mass mass = new Mass();
        Metrics metrics = new Metrics ();

        try {
            boolean isFinished = false;
            while (!isFinished) {
                printOptions();
                int operation = Integer.parseInt(scanner.nextLine());
                switch (operation) {
                    case 1:
                        mass.wyborMasy();
                        break;
                    case 2:
                        metrics.wyborMetrics ();
                        break;
                    case 3:
                        System.out.println("TEMPERATURE");
                        break;
                    case 4:
                        isFinished = true;
                        System.out.println("Koniec programu");
                        break;

                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Podałeś złą wartość! Spróbuj ponownie.");
        }
    }
}



