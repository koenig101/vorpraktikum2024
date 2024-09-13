import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Bibliothek bibliothek = new Bibliothek();

        Buch buch1 = new Buch("Java Grundlagen", "Autor A", "123456789");
        Buch buch2 = new Buch("OOP in Java", "Autor B", "987654321");

        bibliothek.hinzufuegen(buch1);
        bibliothek.hinzufuegen(buch2);

        bibliothek.alleBuecherAnzeigen();

        bibliothek.buecherInDateiSchreiben("buecher.txt");
        bibliothek.buecherAusDateiLesen("buecher.txt");

        System.out.println("Buecher aus Datei:");
        bibliothek.alleBuecherAnzeigen();
    }
}
