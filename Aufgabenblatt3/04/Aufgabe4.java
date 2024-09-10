import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summe = 0;
        int zahl;

        // a) Wiederholt Zahlen einlesen, bis 0 eingegeben wird
        do {
            System.out.print("Gib eine Zahl ein (0 zum Beenden): ");
            zahl = scanner.nextInt();
            System.out.println("Eingegebene Zahl: " + zahl);

            // b) Summe der eingegebenen Zahlen berechnen
            summe += zahl;
        } while (zahl != 0);

        System.out.println("Die Summe der eingegebenen Zahlen ist: " + summe);

        scanner.close();
    }
}
