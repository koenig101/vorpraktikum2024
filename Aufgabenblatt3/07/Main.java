public class Main {
    public static void main(String[] args) {
        // a) Ein Hund-Objekt erstellen und Attribute zuweisen
        Hund meinHund = new Hund();
        meinHund.name = "Rex";
        meinHund.alter = 5;

        // b) bellen() Methode aufrufen
        meinHund.bellen();

        // c) spielen() Methode aufrufen
        meinHund.spielen();
    }
}