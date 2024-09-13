public class Admin extends Nutzer {
    String zugriffsrechte;

    public Admin(String name, int alter, String zugriffsrechte) {
        super(name, alter);
        this.zugriffsrechte = zugriffsrechte;
    }

    @Override
    public void druckeInfo() {
        System.out.println("Name: " + name + ", Alter: " + alter + ", Zugriffsrechte: " + zugriffsrechte);
    }
}