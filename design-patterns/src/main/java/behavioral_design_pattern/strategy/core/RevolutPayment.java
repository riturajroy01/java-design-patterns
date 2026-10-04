package behavioral_design_pattern.strategy.core;


import behavioral_design_pattern.strategy.strategy.PaymentStrategy;

public class RevolutPayment extends Payment {
    public RevolutPayment(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }
}
