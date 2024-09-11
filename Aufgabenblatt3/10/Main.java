public class Main {
    public static void main(String[] args) {
        // Erstellen von Auto-Objekten
        Auto auto1 = new Auto("Mercedes", "S-Klasse", 1990, 150000);
        Auto auto2 = new Auto("BMW", "3er", 2005, 180000);
        Auto auto3 = new Auto("VW", "Golf", 1985, 250000);

        // Infos der Autos ausgeben
        auto1.druckeInfo();
        auto2.druckeInfo();
        auto3.druckeInfo();

        // Prüfen, ob die Autos Oldtimer sind
        if (auto1.istOldtimer()) {
            System.out.println(auto1.marke + " " + auto1.modell + " ist ein Oldtimer.");
        }
        if (auto2.istOldtimer()) {
            System.out.println(auto2.marke + " " + auto2.modell + " ist ein Oldtimer.");
        }
        if (auto3.istOldtimer()) {
            System.out.println(auto3.marke + " " + auto3.modell + " ist ein Oldtimer.");
        }
    }
}