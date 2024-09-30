// client code 

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Set the strategy to Credit Card and make a payment
        paymentProcessor.setPaymentStrategy(new CreditCardPayment());
        paymentProcessor.processPayment(500);

        // Switch to PayPal payment
        paymentProcessor.setPaymentStrategy(new PayPalPayment());
        paymentProcessor.processPayment(300);
    }
}
