package ProjectApka;

public class Main {

    public static void main(String[] args) {
        Temperature temp = new Temperature();
        Metrics metrics = new Metrics();
        Mass mass = new Mass();

double tempToCalc = 2;

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

        metrics.feetToMetr(tempToCalc);
        metrics.feetToYard(tempToCalc);
        metrics.feetToLandMile(tempToCalc);
        metrics.metrToSeaMile(tempToCalc);
        metrics.feetToSeaMile(tempToCalc);
        metrics.metrToFeet(tempToCalc);
        metrics.metrToLandMile(tempToCalc);
        metrics.metrToYard(tempToCalc);
        metrics.yardToLandMile(tempToCalc);
        metrics.LandMileToSeaMile(tempToCalc);
        metrics.seaMileToFeet(tempToCalc);
            System.out.println("Nie wszystko dodane do wydruku sprawdzajacego");


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
