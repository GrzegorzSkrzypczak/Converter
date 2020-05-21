package ProjectApka;

public class Temperature {
    double celsius;
    double kelwin;
    double fahrenheit;


    double celsiusToKelwin(double celsius) {
        this.celsius = celsius;
        return celsius += 273.15;

    }

    double celsiusToFahrenheit(double celsius) {
        this.celsius = celsius;
        return celsius = (celsius * 1.8) + 32;

    }

    double kelwinToCelsius(double kelwin) {
        this.kelwin = kelwin;
        return kelwin -= 273.15;

    }

    double kelwinToFahrenheit(double kelwin) {
        this.kelwin = kelwin;
        return kelwin = (kelwin - 273.15) * 1.8 + 32;

    }

    double fahrenheitToCelsius(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        return fahrenheit = (fahrenheit - 32) / 1.8;
    }

    public double fahrenheitToKelwin(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        return fahrenheit = (fahrenheit - 32) / 1.8 + 273.15;
    }
}


