class Buch {
    // Attribute der Klasse Buch
    private String titel;
    private String autor;
    private String isbn;
    private int seitenzahl;

    // Konstruktor zur Initialisierung der Attribute
    public Buch(String titel, String autor, String isbn, int seitenzahl) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
        this.seitenzahl = seitenzahl;
    }

    // Methode, um die Informationen eines Buches auszugeben
    public void druckeInfo() {
        System.out.println("Titel: " + titel);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Seitenzahl: " + seitenzahl);
        System.out.println();
    }

    // Getter für ISBN, um es zur Suche zu verwenden
    public String getIsbn() {
        return isbn;
    }
}
