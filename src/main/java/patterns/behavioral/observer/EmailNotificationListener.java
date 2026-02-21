package patterns.behavioral.observer;

public class EmailNotificationListener implements EventListener {

    @Override
    public void update(String eventType, BaseEvent event) {
        if(event instanceof OrderEvent orderEvent) {
            if (eventType.equals(OrderService.ORDER_CREATED)) {
                System.out.println(orderEvent.getOrderId() + " numaralı siparişiniz başarıyla alınmıştır. Toplam tutar: " + orderEvent.getTotalAmount());
            } else if (eventType.equals(OrderService.ORDER_FAIL)) {
                System.out.println(orderEvent.getOrderId() + " numaralı siparişiniz alınırken bir hata oluştu.");
            }
        }
    }
}
