import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {

        // a) Ausgabe von "Hello, World!"
        System.out.println("Hello, World!");

        // b) Benutzereingabe für den Namen und Begrüßung
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib deinen Namen ein: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
