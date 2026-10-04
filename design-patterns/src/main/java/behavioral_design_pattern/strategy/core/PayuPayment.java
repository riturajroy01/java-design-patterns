package behavioral_design_pattern.strategy.core;


import behavioral_design_pattern.strategy.strategy.PaymentStrategy;

public class PayuPayment  extends Payment {
    public PayuPayment(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }
}
