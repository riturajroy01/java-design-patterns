package core;

import strategy.PaymentStrategy;

public class PayuPayment  extends Payment {
    public PayuPayment(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }
}
