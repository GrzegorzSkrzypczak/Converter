package ProjectApka.viewController;

import ProjectApka.Mass;
import ProjectApka.Metrics;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ConsoleDataView implements Runnable {

    static Scanner scanner = new Scanner (System.in);

    private static void printOptions() {
        System.out.println("Wybierz opcję: ");
        for (Opcje option : Opcje.values()) {
            System.out.println(option.optionNumber
                    + ": " + option
                    + " - " + option.desciprion);
        }
    }

    @Override
    public void run() {
        wyborOpcji ();
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
                int operation = scanner.nextInt ();

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
                        break;

                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Podałeś złą wartość! Spróbuj ponownie.");
        }
    }
}



