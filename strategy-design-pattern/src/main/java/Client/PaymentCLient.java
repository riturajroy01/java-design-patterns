package Client;

import core.*;
import strategy.PaymentStrategy;
import strategy.PaypalPaymentStrategy;
import strategy.PayuPaymentStrategy;
import strategy.RevolutPaymentStrategy;

public class PaymentCLient {
    public static void main(String[] args) {
        // braintree and paypal both have same strategy that is PaypalPaymentStrategy. But they are different payment methods. So we can use the same strategy for both payment methods.
        // we do not need to create a new strategy for braintree. We can use the same strategy for both payment methods. This will avoid dulplication of code and will make the code more maintainable.
        // Revolut has different strategy that is RevolutPaymentStrategy. So we can use different strategy for different payment methods.
        //

        PaymentStrategy paypalPaymentStrategy = new PaypalPaymentStrategy("a@gmail.com", "123456");
        PaymentStrategy braintreePaymentStrategy = new PaypalPaymentStrategy("b@gmail.com", "9876543");
        PaymentStrategy revolutPaymentStrategy = new RevolutPaymentStrategy("123456789", "1234");
        PaymentStrategy payuPaymentStrategy = new PayuPaymentStrategy("1234567@payu.com", "654321");


        Payment paypalPayment = new PaypalPayment(paypalPaymentStrategy);
        paypalPayment.payment(new java.math.BigDecimal("100.00"));

        Payment braintreePayment = new BraintreePayment(braintreePaymentStrategy);
        braintreePayment.payment(new java.math.BigDecimal("200.00"));

        Payment revolutPayment = new RevolutPayment(revolutPaymentStrategy);
        revolutPayment.payment(new java.math.BigDecimal("300.00"));

        Payment payuPayment = new PayuPayment(payuPaymentStrategy);
        payuPayment.payment(new java.math.BigDecimal("400.00"));



    }
}
