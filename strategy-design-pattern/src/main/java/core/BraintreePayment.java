package core;

import strategy.PaymentStrategy;

public class BraintreePayment  extends Payment{
    public BraintreePayment(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }
}
