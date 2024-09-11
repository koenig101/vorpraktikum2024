import java.util.ArrayList;
import java.util.List;

class Bibliothek {
    // Liste, um Buch-Objekte zu speichern
    private List<Buch> buecherListe;

    // Konstruktor zur Initialisierung der Liste
    public Bibliothek() {
        this.buecherListe = new ArrayList<>();
    }

    // Methode zum Hinzufügen eines Buches
    public void buchHinzufuegen(Buch buch) {
        buecherListe.add(buch);
    }

    // Methode zum Entfernen eines Buches anhand der ISBN
    public void buchEntfernen(String isbn) {
        buecherListe.removeIf(b -> b.getIsbn().equals(isbn));
        System.out.println("Buch mit ISBN " + isbn + " wurde entfernt.\n");
    }

    // Methode, um alle Bücher in der Liste anzuzeigen
    public void alleBuecherAnzeigen() {
        if (buecherListe.isEmpty()) {
            System.out.println("Keine Bücher in der Bibliothek.");
        } else {
            System.out.println("Liste der Bücher:");
            for (Buch buch : buecherListe) {
                buch.druckeInfo();
            }
        }
    }

    // Methode, um ein Buch anhand der ISBN zu suchen
    public void buchSuchen(String isbn) {
        for (Buch buch : buecherListe) {
            if (buch.getIsbn().equals(isbn)) {
                System.out.println("Buch gefunden:");
                buch.druckeInfo();
                return;
            }
        }
        System.out.println("Kein Buch mit der ISBN " + isbn + " gefunden.\n");
    }

    // main-Methode zur Durchführung der Operationen
    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek();

        // Bücher erstellen und hinzufügen
        Buch buch1 = new Buch("Der Herr der Ringe", "J.R.R. Tolkien", "978-3-123456-47-8", 1200);
        Buch buch2 = new Buch("Harry Potter", "J.K. Rowling", "978-3-987654-32-1", 500);
        Buch buch3 = new Buch("Java für Einsteiger", "Max Mustermann", "978-3-111111-11-1", 350);

        bibliothek.buchHinzufuegen(buch1);
        bibliothek.buchHinzufuegen(buch2);
        bibliothek.buchHinzufuegen(buch3);

        // Alle Bücher anzeigen
        bibliothek.alleBuecherAnzeigen();

        // Ein Buch anhand der ISBN suchen
        bibliothek.buchSuchen("978-3-123456-47-8");

        // Ein Buch entfernen
        bibliothek.buchEntfernen("978-3-987654-32-1");

        // Aktualisierte Liste anzeigen
        bibliothek.alleBuecherAnzeigen();
    }
}