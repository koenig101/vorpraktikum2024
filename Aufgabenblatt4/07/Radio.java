public class Radio implements Geraet {
    @Override
    public void einschalten() {
        System.out.println("Radio eingeschaltet");
    }

    @Override
    public void ausschalten() {
        System.out.println("Radio ausgeschaltet");
    }
}