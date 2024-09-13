public class Auto implements FahrzeugInterface {
    @Override
    public void start() {
        System.out.println("Auto startet");
    }

    @Override
    public void stop() {
        System.out.println("Auto stoppt");
    }
}