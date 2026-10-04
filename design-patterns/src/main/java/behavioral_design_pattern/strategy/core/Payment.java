package behavioral_design_pattern.strategy.core;



import behavioral_design_pattern.strategy.strategy.PaymentStrategy;

import java.math.BigDecimal;

public class Payment {
    private final PaymentStrategy paymentStrategy;
    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payment(BigDecimal amount) {
        paymentStrategy.pay(amount);
    }
}
