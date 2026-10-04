package behavioral_design_pattern.strategy.strategy;

import java.math.BigDecimal;

public class RevolutPaymentStrategy  implements  PaymentStrategy {
    private String phoneNumber;
    private String pin;

    public RevolutPaymentStrategy(String phoneNumber, String pin) {
        this.phoneNumber = phoneNumber;
        this.pin = pin;
    }

    @Override
    public BigDecimal pay(BigDecimal amount) {
        // Implement Revolut payment logic here
        System.out.println("Paying " + amount + " using Revolut.");
        return amount;
    }
}
