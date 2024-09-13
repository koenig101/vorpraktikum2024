import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();
        fahrzeuge.add(new Auto("BMW", 2020, 10000));
        fahrzeuge.add(new Motorrad("Yamaha", 2018, 5000));

        for (Fahrzeug f : fahrzeuge) {
            f.fahre(100);
            f.druckeInfo();
        }
    }
}
