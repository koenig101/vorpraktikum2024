public class Auto extends Fahrzeug {
    public Auto(String marke, int baujahr, int kilometerstand) {
        super(marke, baujahr, kilometerstand);
    }

    @Override
    public void fahre(int km) {
        kilometerstand += km + 5;
    }
}