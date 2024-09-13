import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Nutzer> nutzerListe = new ArrayList<>();
        nutzerListe.add(new Nutzer("Max", 30));
        nutzerListe.add(new Admin("Anna", 40, "Admin"));

        FileWriter writer = new FileWriter("nutzer.txt");
        for (Nutzer nutzer : nutzerListe) {
            writer.write(nutzer.name + "," + nutzer.alter + "\n");
            if (nutzer instanceof Admin) {
                Admin admin = (Admin) nutzer;
                writer.write(admin.zugriffsrechte + "\n");
            }
        }
        writer.close();

        System.out.println("Nutzer gespeichert.");
        System.out.println("Lese aus der Datei...");

        BufferedReader reader = new BufferedReader(new FileReader("nutzer.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
