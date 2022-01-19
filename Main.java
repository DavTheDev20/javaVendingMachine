import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Java Vending Machine!");

        VendingMachine spriteVendingMachine = new VendingMachine(25, 50.00, 3.25);

        boolean vendingMachineOn = true;

        while (vendingMachineOn) {
            System.out.println("Please select an option:");
            System.out.println("purchase drink, maintenance mode, shut down");
            String option = scanner.nextLine();
            System.out.println();

            if (option.toLowerCase().equals("purchase drink")) {
                System.out.println("Enter an amount to enter into machine:");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                spriteVendingMachine.despenseBeverage(amount);
            } else if (option.toLowerCase().equals("maintenance mode")) {
                System.out.println("Select a maintence option");
                System.out.println("display beverages left, display money, display cost per beverage");
                String maintenanceOption = scanner.nextLine();
                if (maintenanceOption.toLowerCase().equals("display beverages left")) {
                    System.out.println(spriteVendingMachine.getNumberOfBeverages() + " beverages left in machine.");
                } else if (maintenanceOption.toLowerCase().equals("display money")) {
                    System.out.println("$" + spriteVendingMachine.getMoney() + " in machine.");
                } else if (maintenanceOption.toLowerCase().equals("display cost per beverage")) {
                    System.out.println("$" + spriteVendingMachine.getCostPerBeverage() + " per beverage currently.");
                } else {
                    System.out.println("Invalid maintenance option, please select again.");
                }
            } else if (option.toLowerCase().equals("shut down")) {
                System.out.println("Good Bye!");
                vendingMachineOn = false;
            } else {
                System.out.println("Invalid option, please select again.\n");
            }

            if (spriteVendingMachine.getMoney() <= 0 || spriteVendingMachine.getNumberOfBeverages() <= 0) {
                System.out.println("Out of beverages or money, shutting down.");
                vendingMachineOn = false;
            }
        }

        scanner.close();
    }
}