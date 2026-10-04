package behavioral_design_pattern.strategy.core;


import behavioral_design_pattern.strategy.strategy.PaymentStrategy;

public class PaypalPayment  extends Payment{
    public PaypalPayment(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }
}
