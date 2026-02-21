package patterns.behavioral.observer;

import java.math.BigDecimal;

public class Driver {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        orderService.getEventManager().subscribe(OrderService.ORDER_CREATED, new EmailNotificationListener());
        orderService.getEventManager().subscribe(OrderService.ORDER_CREATED, new StockUpdateListener());
        orderService.getEventManager().subscribe(OrderService.ORDER_FAIL, new EmailNotificationListener());

        System.out.println("\n--------- Success Scenario ----------");
        orderService.createOrder(OrderEvent.builder().orderId(7841L).totalAmount(new BigDecimal(13450)).isSuccess(true).build());

        System.out.println("\n--------- Fail Scenario ----------");
        orderService.createOrder(OrderEvent.builder().orderId(1673L).totalAmount(new BigDecimal(1071)).isSuccess(false).build());
    }
}
