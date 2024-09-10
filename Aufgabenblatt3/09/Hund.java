public class Hund {
    private String name;
    private int alter;

    // Getter für Name
    public String getName() {
        return name;
    }

    // Setter für Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter für Alter
    public int getAlter() {
        return alter;
    }

    // Setter für Alter mit Validierung (Alter muss zwischen 0 und 20 sein)
    public void setAlter(int alter) {
        if (alter >= 0 && alter <= 20) {
            this.alter = alter;
        } else {
            System.out.println("Ungueltiges Alter.");
        }
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
