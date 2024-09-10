public class Main {
    public static void main(String[] args) {
        Hund meinHund = new Hund();
        meinHund.setName("Rex");
        meinHund.setAlter(5);

        System.out.println("Name: " + meinHund.getName());
        System.out.println("Alter: " + meinHund.getAlter());

        meinHund.setAlter(21); // Ungültiges Alter setzen
    }
}