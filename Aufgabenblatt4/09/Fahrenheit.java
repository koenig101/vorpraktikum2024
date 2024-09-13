public class Fahrenheit extends Temperatur {
    @Override
    public double konvertiere(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}