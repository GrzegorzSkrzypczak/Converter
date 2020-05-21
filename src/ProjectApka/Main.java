package ProjectApka;

public class Main {

    public static void main(String[] args) {
        Temperature temp = new Temperature();
        System.out.println(temp.celsiusToKelwin(10));
        System.out.println(temp.celsiusToFahrenheit(10));
        System.out.println(temp.kelwinToFahrenheit(10));
        System.out.println(temp.kelwinToCelsius(283.15));
        System.out.println(temp.fahrenheitToCelsius(50));
        System.out.println(temp.fahrenheitToKelwin(-441.70));


    }
}
