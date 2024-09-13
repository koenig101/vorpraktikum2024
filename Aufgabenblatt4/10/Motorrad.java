public class Motorrad extends Fahrzeug {
    public Motorrad(String marke, int baujahr, int kilometerstand) {
        super(marke, baujahr, kilometerstand);
    }

    @Override
    public void fahre(int km) {
        kilometerstand += km;
    }
}