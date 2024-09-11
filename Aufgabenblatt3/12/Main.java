import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LiquidContainers first = new LiquidContainers();
        LiquidContainers second = new LiquidContainers();

        while (true) {
            System.out.println("First: " + first.getAmount() + "/100");
            System.out.println("Second: " + second.getAmount() + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);

            } else if (command.equals("move")) {
                first.move(second, amount);

            } else if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}
