public class VendingMachine {

    private int numberOfBeverages;
    private double money;
    private double costPerBeverage;

    public VendingMachine(int numberOfBeverages, double money, double costPerBeverage) {
        this.money = money;
        this.numberOfBeverages = numberOfBeverages;
        this.costPerBeverage = costPerBeverage;
    }

    public void despenseBeverage(double inputtedAmount) {
        if (inputtedAmount < costPerBeverage) {
            System.out.println("Not enough money entered.");
        } else {
            double change = inputtedAmount - costPerBeverage;
            this.money -= change;
            this.money += costPerBeverage;
            this.numberOfBeverages -= 1;
            System.out.println("Your change is " + change);
            System.out.println("Enjoy your beverage!");
        }
    }

    public int getNumberOfBeverages() {
        return this.numberOfBeverages;
    }

    public double getMoney() {
        return this.money;
    }

    public double getCostPerBeverage() {
        return this.costPerBeverage;
    }

    public void setNumberOfBeverages(int numberOfBeverages) {
        this.numberOfBeverages = numberOfBeverages;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setCostPerBeverage(double costPerBeverage) {
        this.costPerBeverage = costPerBeverage;
    }

}
