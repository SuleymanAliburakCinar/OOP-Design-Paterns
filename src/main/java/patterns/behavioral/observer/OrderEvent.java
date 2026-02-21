package patterns.behavioral.observer;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class OrderEvent implements BaseEvent{
    private final Long orderId;
    private BigDecimal totalAmount;
    private boolean isSuccess;
}

