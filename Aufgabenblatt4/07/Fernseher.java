public class Fernseher implements Geraet {
    @Override
    public void einschalten() {
        System.out.println("Fernseher eingeschaltet");
    }

    @Override
    public void ausschalten() {
        System.out.println("Fernseher ausgeschaltet");
    }
}