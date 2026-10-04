package behavioral_design_pattern.strategy.core;


import behavioral_design_pattern.strategy.strategy.PaymentStrategy;

public class BraintreePayment  extends Payment{
    public BraintreePayment(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }
}
