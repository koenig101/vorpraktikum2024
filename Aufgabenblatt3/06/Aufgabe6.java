public class Aufgabe6 {
    public static void main(String[] args) {
        // a) Zahlen von 1 bis 10 ausgeben, aber 5 überspringen
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // 5 wird übersprungen
            }
            System.out.println(i);
        }

        // b) Schleife bei 8 abbrechen
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                break; // Schleife wird bei 8 abgebrochen
            }
            System.out.println(i);
        }

        // c) Gerade Zahlen zwischen 1 und 20 ausgeben, aber 12 überspringen
        for (int i = 2; i <= 20; i += 2) {
            if (i == 12) {
                continue; // 12 wird übersprungen
            }
            System.out.println(i);
        }
    }
}
