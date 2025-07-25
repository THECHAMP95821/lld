package lld.behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void processPayment(){
        System.out.println("CreditCard processPayment");
    }
}
