package behavioral_design_pattern.strategy.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {
    BigDecimal pay(BigDecimal amount);
}
