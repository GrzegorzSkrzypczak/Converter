package ProjectApka;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        printOptions();
        wyborOpcji(scanner.nextInt());


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

        public int getOptionNumber() {
            return optionNumber;
        }

        Opcje(int optionNumber, String desciprion) {
            this.optionNumber = optionNumber;
            this.desciprion = desciprion;


        }
    }


    public static void wyborOpcji(int opcja) {

        switch (opcja) {
            case 1:
                System.out.println("wybrałeś 1");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Podałeś złą opcję");
        }
    }
}



