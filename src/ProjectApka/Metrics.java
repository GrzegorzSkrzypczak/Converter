package ProjectApka;

public class Metrics {
    double feet;
    double metr;
    double yard;
    double landMile;
    double seaMile;


    void footToMetr(double feet) {
        this.feet = feet;
        System.out.format("%.2f%n", feet / 3.2808);
    }

    void footToYard(double feet) {
        this.feet = feet;
        System.out.format("%.2f%n", feet * 0.33333);
    }


    void footToLandMile(double feet) {
        this.feet = feet;
        System.out.format("%.2f%n", feet * 0.00018939);
    }

    void footToSeaMile(double metr) {
        this.metr = metr;
        System.out.format("%.2f%n", metr * 0.00016457883);
    }



    void metrToSeaMile(double metr) {
        this.metr = metr;
        System.out.format("%.2f%n",metr * 0.00053961);
    }


     void metrToFoot(double metr) {
            this.metr = metr;
            System.out.format("%.2f%n", metr * 3.2808);
        }
    }



