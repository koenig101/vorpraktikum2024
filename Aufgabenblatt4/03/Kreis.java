public class Kreis extends Form {
    double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    @Override
    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }
}