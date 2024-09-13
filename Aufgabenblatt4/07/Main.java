import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Geraet> geraete = new ArrayList<>();
        geraete.add(new Fernseher());
        geraete.add(new Radio());

        for (Geraet g : geraete) {
            g.einschalten();
            g.ausschalten();
        }
    }
}
