public class Motorrad implements FahrzeugInterface {
    @Override
    public void start() {
        System.out.println("Motorrad startet");
    }

    @Override
    public void stop() {
        System.out.println("Motorrad stoppt");
    }
}