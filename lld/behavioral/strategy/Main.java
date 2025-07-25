package lld.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new PaytmStrategy());
        paymentProcessor.processPayment();
        paymentProcessor.setPaymentStrategy(new CreditCardStrategy());
        paymentProcessor.processPayment();
    }
}
