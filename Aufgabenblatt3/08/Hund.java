public class Hund {
    private String name;
    private int alter;

    // a) Konstruktor mit zwei Parametern
    public Hund(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    // b) Konstruktor mit einem Parameter (Alter = 1)
    public Hund(String name) {
        this(name, 1); // Konstruktorverkettung mit this()
    }

    // Methode bellen
    public void bellen() {
        System.out.println("Wuff!");
    }

    // Methode zum Anzeigen der Hund-Informationen
    public void druckeInfo() {
        System.out.println("Name: " + name + ", Alter: " + alter);
    }
}
