package ProjectApka;

public class Main {

    public static void main(String[] args) {
        Temperature temp = new Temperature();
        Metrics metrics = new Metrics();
        Mass mass = new Mass();

double tempToCalc = 1;

        System.out.println("Temperature");
        System.out.println("____________________________________");

        temp.celsiusToKelwin(tempToCalc);
        temp.celsiusToFahrenheit(tempToCalc);
        temp.kelwinToFahrenheit(tempToCalc);
        temp.kelwinToCelsius(tempToCalc);
        temp.fahrenheitToCelsius(tempToCalc);
        temp.fahrenheitToKelwin(tempToCalc);

        System.out.println();
        System.out.println("Metrics");
        System.out.println("____________________________________");

        metrics.footToMetr(tempToCalc);
        metrics.footToYard(tempToCalc);
        metrics.footToLandMile(tempToCalc);
        metrics.metrToSeaMile(tempToCalc);
        metrics.footToSeaMile(tempToCalc);
        metrics.metrToFoot(tempToCalc);


        System.out.println();
        System.out.println("Mass: ");
        System.out.println("____________________________________");


        mass.kilogramToPunds(tempToCalc);
        mass.kilogramToUncja(tempToCalc);
        mass.poundsToKilograms(tempToCalc);
        mass.poundsToUncja(tempToCalc);
        mass.uncjaToKilograms(tempToCalc);
        mass.uncjaToPonds(tempToCalc);


    }
}
