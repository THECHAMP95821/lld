package lld.behavioral.strategy;

public class PaytmStrategy implements PaymentStrategy {
    @Override
    public void processPayment(){
        System.out.println("PaytmStrategy processPayment");
    }
}
