package ProjectApka;

public class Mass {

    double kg;
    double pounds;
    double uncja;

    void kilogramToPunds(double kilograms) {
        this.kg = kilograms;
        System.out.format("%.2f%n",kilograms * 2.2046);
    }

    void kilogramToUncja(double kilograms) {
        this.kg = kilograms;
        System.out.format("%.2f%n",kilograms * 35.274);
    }

    void poundsToKilograms(double pounds) {
        this.pounds = pounds;
        System.out.format("%.2f%n",pounds * 0.45359237);
    }

    void poundsToUncja(double pounds) {
        this.pounds = pounds;
        System.out.format("%.2f%n",pounds * 16);
    }

    void uncjaToKilograms(double uncja) {
        this.uncja = uncja;
        System.out.format("%.2f%n",uncja / 35.274);
    }

    void uncjaToPonds(double uncja) {
        this.uncja = uncja;
        System.out.format("%.2f%n",uncja * 0.062500);
    }


}
