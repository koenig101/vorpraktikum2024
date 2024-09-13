public class Main {
    public static void main(String[] args) {
        FahrzeugInterface auto = new Auto();
        FahrzeugInterface motorrad = new Motorrad();

        auto.start();
        auto.stop();

        motorrad.start();
        motorrad.stop();
    }
}
