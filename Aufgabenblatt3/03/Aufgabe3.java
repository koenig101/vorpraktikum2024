public class Aufgabe3 {
    public static void main(String[] args) {
        // a) Zahlen von 1 bis 10 ausgeben
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // b) Quadrate der Zahlen von 1 bis 10 ausgeben
        for (int i = 1; i <= 10; i++) {
            System.out.println("Quadrat von " + i + " = " + (i * i));
        }

        // c) Gerade Zahlen zwischen 1 und 20 ausgeben
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
