package ProjectApka;

public class Metrics {
    double feet;
    double metr;
    double yard;
    double landMile;
    double seaMile;


    void feetToMetr(double feet) {
        this.feet = feet;
        System.out.format("%.2f%n", feet / 3.2808);
    }

    void feetToYard(double feet) {
        this.feet = feet;
        System.out.format("%.2f%n", feet * 0.33333);
    }


    void feetToLandMile(double feet) {
        this.feet = feet;
        System.out.format("%.2f%n", feet * 0.00018939);
    }

    void feetToSeaMile(double metr) {
        this.metr = metr;
        System.out.format("%.2f%n", metr * 0.00016457883);
    }

    void metrToFeet(double metr) {
        this.metr = metr;
        System.out.format("%.2f%n", metr * 3.2808);
    }

    void metrToSeaMile(double metr) {
        this.metr = metr;
        System.out.format("%.2f%n", metr * 0.00053961);
    }

    void metrToYard(double metr) {
        this.metr = metr;
        System.out.format("%.2f%n", metr * 1.0936);
    }

    void metrToLandMile(double metr) {
        this.metr = metr;
        System.out.format("%.2f%n", metr * 0.00062136994949495);
    }

    void yardToFeet (double yard){
        this.yard = yard;
        System.out.format("%.2f%n", yard * 3.0000);
    }

    void yardToMetr (double yard){
        this.yard = yard;
        System.out.format("%.2f%n", yard / 1.0936);
    }

    void yardToSeaMile (double yard){
        this.yard = yard;
        System.out.format("%.2f%n", yard * 0.00049374);
    }

    void yardToLandMile (double yard){
        this.yard = yard;
        System.out.format("%.2f%n", yard * 0.000568181818);
    }

    void LandMileToFeet (double landMile){
        this.landMile = landMile;
        System.out.format("%.2f%n", landMile * 5280.0);
    }

    void LandMileToMetr (double landMile){
        this.landMile = landMile;
        System.out.format("%.2f%n", landMile * 1609.344);
    }

    void LandMileToYard (double landMile){
        this.landMile = landMile;
        System.out.format("%.2f%n", landMile * 1760.0);
    }

    void LandMileToSeaMile (double landMile){
        this.landMile = landMile;
        System.out.format("%.2f%n", landMile * 0.8689779798566);
    }

    void seaMileToFeet (double seaMile){
        this.seaMile = seaMile;
        System.out.format("%.2f%n", seaMile * 6076.11548556);
    }

    void seaMileToMetr (double seaMile){
        this.seaMile = seaMile;
        System.out.format("%.2f%n", seaMile * 1852.0);
    }

    void seaMileToYard (double seaMile){
        this.seaMile = seaMile;
        System.out.format("%.2f%n", seaMile * 2025.37);
    }

    void seaMileToLandMile (double seaMile){
        this.seaMile = seaMile;
        System.out.format("%.2f%n", seaMile * 1,15);
    }
}





