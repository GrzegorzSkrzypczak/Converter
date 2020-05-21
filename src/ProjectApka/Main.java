package ProjectApka;

public class Main {

    public static void main(String[] args) {

        System.out.println("Temperature: ");
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


        System.out.println();
        System.out.println("Mass: ");
        System.out.println("____________________________________");

        Mass mass = new Mass();
        mass.kilogramToPunds(1);
        mass.kilogramToUncja(1);
        mass.poundsToKilograms(1);
        mass.poundsToUncja(1);
        mass.uncjaToKilograms(1);
        mass.uncjaToPonds(1);


    }
}
