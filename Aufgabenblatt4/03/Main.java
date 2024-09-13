
public class Main {
    public static void main(String[] args) {
        Kreis kreis = new Kreis(5);
        Rechteck rechteck = new Rechteck(4, 6);

        kreis.druckeForm("Kreis");
        System.out.println("Flaeche des Kreises: " + kreis.berechneFlaeche());

        rechteck.druckeForm("Rechteck");
        System.out.println("Flaeche des Rechtecks: " + rechteck.berechneFlaeche());
    }
}
