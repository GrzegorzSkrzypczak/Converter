package ProjectApka.fxController.mass.kg;

public class KgToUncjeController implements Converter {
    @Override
    public double convert(double value) {
        return value * 35.274;
    }
}
