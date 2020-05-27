package ProjectApka;

import java.util.Scanner;

public class Metrics {
    double feet;
    double metr;
    double yard;
    double landMile;
    double seaMile;


    void feetToMetr(double feet) {
        this.feet = feet;
        System.out.format ("%.2f%n", feet / 3.2808);
    }

    void feetToYard(double feet) {
        this.feet = feet;
        System.out.format ("%.2f%n", feet * 0.33333);
    }


    void feetToLandMile(double feet) {
        this.feet = feet;
        System.out.format ("%.2f%n", feet * 0.00018939);
    }

    void feetToSeaMile(double metr) {
        this.metr = metr;
        System.out.format ("%.2f%n", metr * 0.00016457883);
    }

    void metrToFeet(double metr) {
        this.metr = metr;
        System.out.format ("%.2f%n", metr * 3.2808);
    }

    void metrToSeaMile(double metr) {
        this.metr = metr;
        System.out.format ("%.2f%n", metr * 0.00053961);
    }

    void metrToYard(double metr) {
        this.metr = metr;
        System.out.format ("%.2f%n", metr * 1.0936);
    }

    void metrToLandMile(double metr) {
        this.metr = metr;
        System.out.format ("%.2f%n", metr * 0.00062136994949495);
    }

    void yardToFeet(double yard) {
        this.yard = yard;
        System.out.format ("%.2f%n", yard * 3.0000);
    }

    void yardToMetr(double yard) {
        this.yard = yard;
        System.out.format ("%.2f%n", yard / 1.0936);
    }

    void yardToSeaMile(double yard) {
        this.yard = yard;
        System.out.format ("%.2f%n", yard * 0.00049374);
    }

    void yardToLandMile(double yard) {
        this.yard = yard;
        System.out.format ("%.2f%n", yard * 0.000568181818);
    }

    void landMileToFeet(double landMile) {
        this.landMile = landMile;
        System.out.format ("%.2f%n", landMile * 5280.0);
    }

    void landMileToMetr(double landMile) {
        this.landMile = landMile;
        System.out.format ("%.2f%n", landMile * 1609.344);
    }

    void landMileToYard(double landMile) {
        this.landMile = landMile;
        System.out.format ("%.2f%n", landMile * 1760.0);
    }

    void landMileToSeaMile(double landMile) {
        this.landMile = landMile;
        System.out.format ("%.2f%n", landMile * 0.8689779798566);
    }

    void seaMileToFeet(double seaMile) {
        this.seaMile = seaMile;
        System.out.format ("%.2f%n", seaMile * 6076.11548556);
    }

    void seaMileToMetr(double seaMile) {
        this.seaMile = seaMile;
        System.out.format ("%.2f%n", seaMile * 1852.0);
    }

    void seaMileToYard(double seaMile) {
        this.seaMile = seaMile;
        System.out.format ("%.2f%n", seaMile * 2025.37);
    }

    void seaMileToLandMile(double seaMile) {
        this.seaMile = seaMile;
        System.out.format ("%.2f%n", seaMile * 1, 15);
    }


    public void wyborMetrics() {
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Wybierz swój przelicznik: ");
        System.out.println ("1. Stopy na metry: ");
        System.out.println ("2. Stopy na yardy: ");
        System.out.println ("3. Stopy na mile lądowe: ");
        System.out.println ("4. Stopy na mile morskie: ");
        System.out.println ("5. Metry na stopy: ");
        System.out.println ("6. Metry na yardy: ");
        System.out.println ("7. Metry na mile lądowe: ");
        System.out.println ("8. Metry na mile morskie: ");
        System.out.println ("9. Yardy na stopy: ");
        System.out.println ("10. Yardy na metry: ");
        System.out.println ("11. Yardy na mile lądowe: ");
        System.out.println ("12. Yardy na mile morskie: ");
        System.out.println ("13. Mile lądowe na stopy");
        System.out.println ("14. Mile lądowe na metry: ");
        System.out.println ("15. Mile lądowe na yardy: ");
        System.out.println ("16. Mile lądowe na mile morskie: ");
        System.out.println ("17. Mile morskie na stopy: ");
        System.out.println ("18. Mile morskie na metry: ");
        System.out.println ("19. Mile morskie na yardy: ");
        System.out.println ("20. Mile morskie na mile lądowe: ");


        boolean isFinished = false;
        while (!isFinished) {
            int operation = scanner.nextInt ();
            switch (operation) {

                case 1:
                    System.out.println ("Podaj wartość: ");
                    feetToMetr (scanner.nextDouble ());
                    break;
                case 2:
                    System.out.println ("Podaj wartość: ");
                    feetToYard (scanner.nextDouble ());
                    break;
                case 3:
                    System.out.println ("Podaj wartość: ");
                    feetToLandMile (scanner.nextDouble ());
                    break;
                case 4:
                    System.out.println ("Podaj wartość: ");
                    feetToSeaMile (scanner.nextDouble ());
                    break;
                case 5:
                    System.out.println ("Podaj wartość: ");
                    metrToFeet (scanner.nextDouble ());
                    break;
                case 6:
                    System.out.println ("Podaj wartość: ");
                    metrToYard (scanner.nextDouble ());
                case 7:
                    System.out.println ("Podaj wartość: ");
                    metrToLandMile (scanner.nextDouble ());
                    break;
                case 8:
                    System.out.println ("Podaj wartość: ");
                    metrToSeaMile (scanner.nextDouble ());
                    break;
                case 9:
                    System.out.println ("Podaj wartość: ");
                    yardToFeet (scanner.nextDouble ());
                    break;
                case 10:
                    System.out.println ("Podaj wartość: ");
                    yardToMetr (scanner.nextDouble ());
                    break;
                case 11:
                    System.out.println ("Podaj wartość: ");
                    yardToLandMile (scanner.nextDouble ());
                    break;
                case 12:
                    System.out.println ("Podaj wartość: ");
                    yardToSeaMile (scanner.nextDouble ());
                    break;
                case 13:
                    System.out.println ("Podaj wartość: ");
                     landMileToFeet (scanner.nextDouble ());
                    break;
                case 14:
                    System.out.println ("Podaj wartość: ");
                    landMileToMetr (scanner.nextDouble ());
                    break;
                case 15:
                    System.out.println ("Podaj wartość: ");
                    landMileToYard (scanner.nextDouble ());
                    break;
                case 16:
                    System.out.println ("Podaj wartość: ");
                    landMileToSeaMile (scanner.nextDouble ());
                    break;
                case 17:
                    System.out.println ("Podaj wartość: ");
                    seaMileToFeet (scanner.nextDouble ());
                    break;
                case 18:
                    System.out.println ("Podaj wartość: ");
                    seaMileToMetr (scanner.nextDouble ());
                    break;
                case 19:
                    System.out.println ("Podaj wartość: ");
                    seaMileToYard (scanner.nextDouble ());
                    break;
                case 20:
                    System.out.println ("Podaj wartość: ");
                    seaMileToLandMile (scanner.nextDouble ());
                    break;
                case 21:
                    isFinished = true;
                    System.out.println ("Koniec programu");
                    break;
            }

        }
    }
}






