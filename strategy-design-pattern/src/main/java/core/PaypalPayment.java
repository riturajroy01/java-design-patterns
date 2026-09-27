package core;

import strategy.PaymentStrategy;

public class PaypalPayment  extends Payment{
    public PaypalPayment(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }
}
