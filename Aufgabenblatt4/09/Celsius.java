public class Celsius extends Temperatur {
    @Override
    public double konvertiere(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}