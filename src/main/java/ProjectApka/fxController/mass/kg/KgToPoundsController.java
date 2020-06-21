package ProjectApka.fxController.mass.kg;

public class KgToPoundsController implements Converter {
    @Override
    public double convert(double value) {
        return value * 2.2046;
    }
}
