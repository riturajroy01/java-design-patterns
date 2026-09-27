package strategy;

import java.math.BigDecimal;

public class PaypalPaymentStrategy implements  PaymentStrategy {
    private String email;
    private String password;

    public PaypalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public BigDecimal pay(BigDecimal amount) {
        // Implement PayPal payment logic here
        System.out.println("Paying " + amount + " using PayPal.");
        return amount;
    }
}
