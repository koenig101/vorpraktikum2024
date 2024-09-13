public class Buch {
    String titel, autor, isbn;

    public Buch(String titel, String autor, String isbn) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String toString() {
        return "Titel: " + titel + ", Autor: " + autor + ", ISBN: " + isbn;
    }
}