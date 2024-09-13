public class Auto extends Fahrzeug {
    int anzahlTueren;

    public Auto(String marke, int anzahlTueren) {
        super(marke);
        this.anzahlTueren = anzahlTueren;
    }

    public void druckeInfo() {
        System.out.println("Marke: " + this.marke + ", Geschwindigkeit: " + this.geschwindigkeit + ", Tueren: "
                + this.anzahlTueren);
    }
}