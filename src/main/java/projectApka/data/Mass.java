package data;

import java.util.Scanner;

public class Mass {

    double kg;
    double pounds;
    double uncja;

    void kilogramToPunds(double kilograms) {
        this.kg = kilograms;
        double result = kilograms * 2.2046;
        System.out.format("%.2f%n", result);

    }

    void kilogramToUncja(double kilograms) {
        this.kg = kilograms;
        System.out.format("%.2f%n", kilograms * 35.274);
    }

    void poundsToKilograms(double pounds) {
        this.pounds = pounds;
        System.out.format("%.2f%n", pounds * 0.45359237);
    }

    void poundsToUncja(double pounds) {
        this.pounds = pounds;
        System.out.format("%.2f%n", pounds * 16);
    }

    void uncjaToKilograms(double uncja) {
        this.uncja = uncja;
        System.out.format("%.2f%n", uncja / 35.274);
    }

    void uncjaToPonds(double uncja) {
        this.uncja = uncja;
        System.out.format("%.2f%n", uncja * 0.062500);
    }

    public void wyborMasy() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz swój przelicznik: ");
        System.out.println("1. Kilogramy na funty: ");
        System.out.println("2. Kilogramy na uncje: ");
        System.out.println("3. Funty na kilogramy: ");
        System.out.println("4. Funty na uncje: ");
        System.out.println("5. Uncje na kilogramy: ");
        System.out.println("6. Uncje na funty: ");
        System.out.println("7. Wyjście: ");

        boolean isFinished = false;
        while (!isFinished) {
            int operation = scanner.nextInt ();
            switch (operation) {

                case 1:
                    System.out.println("Podaj wartość (kilogramy na funty): ");
                    kilogramToPunds(scanner.nextDouble());
                    break;
                case 2:
                    System.out.println("Podaj wartość: ");
                    kilogramToUncja(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Podaj wartość: ");
                    poundsToKilograms(scanner.nextDouble());
                    break;
                case 4:
                    System.out.println("Podaj wartość: ");
                    poundsToUncja(scanner.nextDouble());
                    break;
                case 5:
                    System.out.println("Podaj wartość: ");
                    uncjaToKilograms(scanner.nextDouble());
                    break;
                case 6:
                    System.out.println("Podaj wartość: ");
                    uncjaToPonds(scanner.nextDouble());
                case 7:
                    isFinished = true;
                    System.out.println("Koniec programu");
                    break;
            }
        }
    }

}
