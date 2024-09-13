import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die Temperatur ein: ");
        double wert = scanner.nextDouble();

        System.out.println("Waehle eine Konvertierung (1 = Fahrenheit zu Celsius, 2 = Celsius zu Fahrenheit): ");
        int wahl = scanner.nextInt();

        Temperatur konverter;
        if (wahl == 1) {
            konverter = new Celsius();
        } else {
            konverter = new Fahrenheit();
        }

        double ergebnis = konverter.konvertiere(wert);
        System.out.println("Konvertierte Temperatur: " + ergebnis);
    }
}
