import java.io.*;
import java.util.ArrayList;

public class Bibliothek implements BuchVerwaltung {
    ArrayList<Buch> buecherListe = new ArrayList<>();

    @Override
    public void hinzufuegen(Buch buch) {
        buecherListe.add(buch);
    }

    @Override
    public void alleBuecherAnzeigen() {
        for (Buch buch : buecherListe) {
            System.out.println(buch);
        }
    }

    public void buecherInDateiSchreiben(String dateiname) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(dateiname));
        for (Buch buch : buecherListe) {
            writer.write(buch.titel + "," + buch.autor + "," + buch.isbn + "\n");
        }
        writer.close();
    }

    public void buecherAusDateiLesen(String dateiname) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(dateiname));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] teile = line.split(",");
            Buch buch = new Buch(teile[0], teile[1], teile[2]);
            hinzufuegen(buch);
        }
        reader.close();
    }
}