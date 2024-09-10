public class Main {
    public static void main(String[] args) {
        // Hund-Objekte mit verschiedenen Konstruktoren erstellen
        Hund hund1 = new Hund("Bello", 3);
        Hund hund2 = new Hund("Max");

        // Methoden aufrufen
        hund1.bellen();
        hund2.bellen();
    }
}