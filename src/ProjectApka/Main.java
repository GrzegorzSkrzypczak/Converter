package ProjectApka;

public class Main {

    public static void main(String[] args) {

        System.out.println("Temperature: ");
        Temperature temp = new Temperature();
        System.out.println(temp.celsiusToKelwin(10));
        System.out.println(temp.celsiusToFahrenheit(10));
        System.out.println(temp.kelwinToFahrenheit(10));
        System.out.println(temp.kelwinToCelsius(283.15));
        System.out.println(temp.fahrenheitToCelsius(50));
        System.out.println(temp.fahrenheitToKelwin(-441.70));

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
