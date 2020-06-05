package projectApka.data;

import java.util.Scanner;

public class Temperature {
    double celsius;
    double kelwin;
    double fahrenheit;


    void celsiusToKelwin(double celsius) {
        this.celsius = celsius;
        System.out.format("%.2f%n", celsius + 273.15);

    }

    void celsiusToFahrenheit(double celsius) {
        this.celsius = celsius;
        System.out.format("%.2f%n", (celsius * 1.8) + 32);

    }

    void kelwinToCelsius(double kelwin) {
        this.kelwin = kelwin;
        System.out.format("%.2f%n", kelwin - 273.15);
    }

    void kelwinToFahrenheit(double kelwin) {
        this.kelwin = kelwin;
        System.out.format("%.2f%n", (kelwin - 273.15) * 1.8 + 32);
    }

    void fahrenheitToCelsius(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        System.out.format("%.2f%n", (fahrenheit - 32) / 1.8);
    }

    void  fahrenheitToKelwin(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        System.out.format("%.2f%n", (fahrenheit - 32) / 1.8 + 273.15);

    }
    public void wyborTemp() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz swój przelicznik: ");
        System.out.println("1. Celsiusz na Kelwiny: ");
        System.out.println("2. Celsiusz n Fahrenheity: ");
        System.out.println("3. Kelwin na Celsiusz: ");
        System.out.println("4. Kelwin na Fahrenheit: ");
        System.out.println("5. Fahrenheity na Celsiusze: ");
        System.out.println("6. Fahrenheity na Kelwin: ");
        System.out.println("7. Wyjście: ");

        boolean isFinished = false;
        while (!isFinished) {
            int operation = scanner.nextInt ();
            switch (operation) {

                case 1:
                    System.out.println("Podaj wartość (Celsiusz na Kelwiny): ");
                    celsiusToKelwin(scanner.nextDouble());
                    break;
                case 2:
                    System.out.println("Podaj wartość (Celsiusz n Fahrenheity): ");
                    celsiusToFahrenheit(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Podaj wartość (Kelwin na Celsiusz): ");
                    kelwinToCelsius(scanner.nextDouble());
                    break;
                case 4:
                    System.out.println("Podaj wartość (Kelwin na Fahrenheit): ");
                    kelwinToFahrenheit(scanner.nextDouble());
                    break;
                case 5:
                    System.out.println("Podaj wartość (Fahrenheity na Celsiusze): ");
                    fahrenheitToCelsius(scanner.nextDouble());
                    break;
                case 6:
                    System.out.println("Podaj wartość (Fahrenheity na Kelwin): ");
                    fahrenheitToKelwin(scanner.nextDouble());
                case 7:
                    isFinished = true;
                    System.out.println("Koniec programu");
                    break;
            }
        }
    }
}


