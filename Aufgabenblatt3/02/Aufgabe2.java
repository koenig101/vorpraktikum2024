import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Einlesen und Ausgabe einer Zahl
        System.out.print("Gib eine Zahl ein: ");
        int zahl1 = scanner.nextInt();
        System.out.println("Du hast die Zahl " + zahl1 + " eingegeben.");

        // b) Einlesen einer zweiten Zahl und Ausgabe der Summe
        System.out.print("Gib eine zweite Zahl ein: ");
        int zahl2 = scanner.nextInt();
        int summe = zahl1 + zahl2;
        System.out.println("Die Summe der beiden Zahlen ist: " + summe);

        scanner.close();
    }
}
