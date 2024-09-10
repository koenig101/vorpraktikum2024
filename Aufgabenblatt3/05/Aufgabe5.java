import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        // a) Benutzer nach einer Zahl fragen und Antwort ausgeben
        System.out.print("Gib eine Zahl zwischen 1 und 3 ein: ");
        int auswahl = scanner.nextInt();

        switch (auswahl) {
            case 1:
                System.out.println("Du hast 1 gewaehlt.");
                break;
            case 2:
                System.out.println("Du hast 2 gewaehlt.");
                break;
            case 3:
                System.out.println("Du hast 3 gewaehlt.");
                break;
            default:
                // b) Default-Fall für ungültige Eingabe
                System.out.println("Ungueltige Eingabe.");
        }

        // c) Auswahl für mathematische Operation
        System.out.print("Waehle eine Operation (1=Addition, 2=Subtraktion, 3=Multiplikation): ");
        int operation = scanner.nextInt();
        System.out.print("Gib die erste Zahl ein: ");
        int zahl1 = scanner.nextInt();
        System.out.print("Gib die zweite Zahl ein: ");
        int zahl2 = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Ergebnis: " + (zahl1 + zahl2));
                break;
            case 2:
                System.out.println("Ergebnis: " + (zahl1 - zahl2));
                break;
            case 3:
                System.out.println("Ergebnis: " + (zahl1 * zahl2));
                break;
            default:
                System.out.println("Ungueltige Auswahl.");
        }

        scanner.close();
    }
}