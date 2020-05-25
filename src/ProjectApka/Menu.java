package ProjectApka;

import java.util.Scanner;


public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        scanner = new Scanner(System.in);
        wyborOpcji();


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

        public int optionNumber;
        public String desciprion;


        Opcje(int optionNumber, String desciprion) {
            this.optionNumber = optionNumber;
            this.desciprion = desciprion;

        }
    }


    public static void wyborOpcji() {

        try {
            boolean isFinished = false;
            while (!isFinished) {
                printOptions();
                int operation = Integer.parseInt(scanner.nextLine());
                switch (operation) {
                    case 1:
                        System.out.println("MASS");
                        break;
                    case 2:
                        System.out.println("METRICS");
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



