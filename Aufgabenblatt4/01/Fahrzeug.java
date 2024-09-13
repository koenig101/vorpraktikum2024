public class Fahrzeug {
    String marke;
    int geschwindigkeit;

    public Fahrzeug(String marke) {
        this.marke = marke;
        this.geschwindigkeit = 0;
    }

    public void beschleunigen(int wert) {
        this.geschwindigkeit += wert;
    }
}