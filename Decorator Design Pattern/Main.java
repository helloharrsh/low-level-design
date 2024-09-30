//  (Client Code) 

public class Main {
    public static void main(String[] args) {
        // Order an espresso with milk and sugar
        Coffee coffee = new Espresso();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription() + " - $" + coffee.cost());

        // Order a cappuccino with double milk
        Coffee anotherCoffee = new Cappuccino();
        anotherCoffee = new MilkDecorator(anotherCoffee);
        anotherCoffee = new MilkDecorator(anotherCoffee);

        System.out.println(anotherCoffee.getDescription() + " - $" + anotherCoffee.cost());
    }
}
