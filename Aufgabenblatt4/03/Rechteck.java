public class Rechteck extends Form {
    double laenge, breite;

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public double berechneFlaeche() {
        return laenge * breite;
    }
}