import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
        mitarbeiterListe.add(new Entwickler());
        mitarbeiterListe.add(new Designer());

        for (Mitarbeiter m : mitarbeiterListe) {
            m.arbeite();
        }
    }
}
