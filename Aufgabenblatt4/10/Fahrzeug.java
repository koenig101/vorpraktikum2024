public abstract class Fahrzeug {
    String marke;
    int baujahr;
    int kilometerstand;

    public Fahrzeug(String marke, int baujahr, int kilometerstand) {
        this.marke = marke;
        this.baujahr = baujahr;
        this.kilometerstand = kilometerstand;
    }

    public abstract void fahre(int km);

    public void druckeInfo() {
        System.out.println("Marke: " + marke + ", Baujahr: " + baujahr + ", Kilometerstand: " + kilometerstand);
    }
}