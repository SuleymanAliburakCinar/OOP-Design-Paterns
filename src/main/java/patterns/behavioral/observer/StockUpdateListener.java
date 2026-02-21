package patterns.behavioral.observer;

public class StockUpdateListener implements EventListener{

    @Override
    public void update(String eventType, BaseEvent event) {
        if(event instanceof OrderEvent orderEvent) {
            System.out.println("Stocklar güncellendi...");
        }
    }
}
