package patterns.behavioral.observer;

public class OrderService {

    private final EventManager eventManager;

    public static final String ORDER_CREATED = "OrderCreated";
    public static final String ORDER_FAIL = "ErrorWhileOrderCreated";

    public OrderService() {
        this.eventManager = new EventManager(ORDER_CREATED, ORDER_FAIL);
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public void createOrder(OrderEvent orderEvent) {

        if (orderEvent.isSuccess()) {
            eventManager.update(ORDER_CREATED, orderEvent);
        } else {
            eventManager.update(ORDER_FAIL, orderEvent);
        }
    }
}
