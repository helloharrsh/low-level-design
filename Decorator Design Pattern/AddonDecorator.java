//  (Abstract Decorator)

public abstract class AddonDecorator extends Coffee {
    protected Coffee coffee;

    public AddonDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public abstract String getDescription();
}
