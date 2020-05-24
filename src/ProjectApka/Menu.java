package ProjectApka;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        printOptions();

    }

    private static void printOptions() {
        System.out.println("Wybierz opcję: ");
        for (Opcje option : Opcje.values()) {
            System.out.println(option.optionNumber
                    + ": " + option
                    + " - " + option.desciprion);
        }
    }


    private enum Opcje {

        MASS(1, "Przeliczenie wagi."),
        METRICS(2, "Przeliczenie pomiarów."),
        TEMPERATURE(3, "Przeliczenie temperatury."),
        EXIT(4, "Wyjście.");

        private int optionNumber;
        private String desciprion;

        Opcje(int optionNumber, String desciprion) {
            this.optionNumber = optionNumber;
            this.desciprion = desciprion;
        }
    }
}

