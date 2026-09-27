package strategy;

import java.math.BigDecimal;

public class PayuPaymentStrategy  implements PaymentStrategy {
    private String merchantId;
    private String apiKey;

    public PayuPaymentStrategy(String merchantId, String apiKey) {
        this.merchantId = merchantId;
        this.apiKey = apiKey;
    }

    @Override
    public BigDecimal pay(BigDecimal amount) {
        // Implement PayU payment logic here
        System.out.println("Paying " + amount + " using PayU.");
        return amount;
    }
}
