package core;

import strategy.PaymentStrategy;

public class RevolutPayment extends Payment {
    public RevolutPayment(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }
}
