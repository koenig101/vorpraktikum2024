public class Main {
    public static void main(String[] args) {
        Gitarre gitarre = new Gitarre();
        Klavier klavier = new Klavier();

        gitarre.stimmen();
        gitarre.spielen();

        klavier.stimmen();
        klavier.spielen();
    }
}
