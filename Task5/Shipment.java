import java.util.ArrayList;
import java.util.List;

public class Shipment {
    private static int nextId = 1;
    private int id;
    private Customer sender;
    private ReceivePoint receiver;
    private List<Item> items;
    private String deliveryMethod;
    private boolean isCancelled;

    public Shipment(Customer sender, ReceivePoint receiver, List<Item> items, String deliveryMethod) {
        this.id = nextId++;
        this.sender = sender;
        this.receiver = receiver;
        this.items = new ArrayList<>(items);
        this.deliveryMethod = deliveryMethod;
        this.isCancelled = false;
    }

    public void cancelShipment() {
        this.isCancelled = true;
    }

    public int getId() {
        return id;
    }

    public Customer getSender() {
        return sender;
    }

    public ReceivePoint getReceiver() {
        return receiver;
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public boolean isCancelled() {
        return isCancelled;
    }
}
