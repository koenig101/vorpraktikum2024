public class Nutzer {
    String name;
    int alter;

    public Nutzer(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void druckeInfo() {
        System.out.println("Name: " + name + ", Alter: " + alter);
    }
}