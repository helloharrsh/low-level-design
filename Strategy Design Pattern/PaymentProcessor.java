// Context 

public class PaymentProcessor {
    private PaymentStrategy strategy;

    // Set the payment strategy dynamically
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Process the payment using the current strategy
    public void processPayment(int amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("No payment strategy selected.");
        }
    }
}
