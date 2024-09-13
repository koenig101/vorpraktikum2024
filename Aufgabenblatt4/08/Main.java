import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die erste Zahl ein: ");
        int a = scanner.nextInt();
        System.out.print("Gib die zweite Zahl ein: ");
        int b = scanner.nextInt();

        System.out.println("Waehle eine Operation (1 = Addition, 2 = Multiplikation): ");
        int wahl = scanner.nextInt();

        Rechenoperation operation;
        if (wahl == 1) {
            operation = new Addition();
        } else {
            operation = new Multiplikation();
        }

        int ergebnis = operation.berechne(a, b);
        System.out.println("Ergebnis: " + ergebnis);
    }
}
