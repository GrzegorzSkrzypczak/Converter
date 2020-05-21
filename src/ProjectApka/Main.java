package ProjectApka;

public class Main {

    public static void main(String[] args) {
        Temperature temp = new Temperature();
        Metrics metrics = new Metrics();

double tempToCalc = 1;

        System.out.println("Temperature");
        temp.celsiusToKelwin(tempToCalc);
        temp.celsiusToFahrenheit(tempToCalc);
        temp.kelwinToFahrenheit(tempToCalc);
        temp.kelwinToCelsius(tempToCalc);
        temp.fahrenheitToCelsius(tempToCalc);
        temp.fahrenheitToKelwin(tempToCalc);

        System.out.println("Metrics");

        metrics.footToMetr(tempToCalc);
        metrics.footToYard(tempToCalc);
        metrics.footToLandMile(tempToCalc);
        metrics.metrToSeaMile(tempToCalc);
        metrics.footToSeaMile(tempToCalc);
        metrics.metrToFoot(tempToCalc);



    }
}
