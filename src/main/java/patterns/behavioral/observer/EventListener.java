package patterns.behavioral.observer;

public interface EventListener {
    void update(String eventType, BaseEvent event);
}
