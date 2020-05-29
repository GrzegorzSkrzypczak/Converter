package data;

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
}


