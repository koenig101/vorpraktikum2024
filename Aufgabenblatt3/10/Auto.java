public class Auto {
    private String marke;
    private String modell;
    private int baujahr;
    private int kilometerstand;

    // Konstruktor
    public Auto(String marke, String modell, int baujahr, int kilometerstand) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kilometerstand = kilometerstand;
    }

    // Methode zum Drucken der Auto-Informationen
    public void druckeInfo() {
        System.out.println("Marke: " + marke + ", Modell: " + modell +
                ", Baujahr: " + baujahr + ", Kilometerstand: " + kilometerstand);
    }

    // Methode zur Überprüfung, ob das Auto ein Oldtimer ist
    public boolean istOldtimer() {
        return (2024 - baujahr) > 30;
    }

    // Getter für Marke
    public String getMarke() {
        return marke;
    }

    // Setter für Marke
    public void setMarke(String marke) {
        this.marke = marke;
    }

    // Getter für Modell
    public String getModell() {
        return modell;
    }

    // Setter für Modell
    public void setModell(String modell) {
        this.modell = modell;
    }

    // Getter für Baujahr
    public int getBaujahr() {
        return baujahr;
    }

    // Setter für Baujahr
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    // Getter für Kilometerstand
    public int getKilometerstand() {
        return kilometerstand;
    }

    // Setter für Kilometerstand
    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }
}
