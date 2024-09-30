 // (Concrete Component)

public class Cappuccino extends Coffee {
    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public double cost() {
        return 2.49;
    }
}
