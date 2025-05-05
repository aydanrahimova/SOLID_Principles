package S_SingleResponsibility.badExample;

/**
 * BAD EXAMPLE of Single Responsibility Principle (SRP).
 * This class does too many things:
 * - Manages order data
 * - Handles business logic
 * - Processes payments
 * - Sends notifications
 */
public class Order {

    private Long id;
    private String itemName;
    private Double price;

    // Constructor
    public Order(Long id, String itemName, Double price) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public Double getPrice() {
        return price;
    }

    /**
     * This method simulates placing an order.
     * It mixes order logic directly into the domain object.
     */
    public void makeOrder() {
        System.out.println("Order placed for: " + itemName);
    }

    /**
     * This method simulates payment processing.
     * It violates SRP by putting payment logic into the Order class.
     */
    public void payForOrder() {
        System.out.println("Payment of $" + price + " processed for: " + itemName);
    }

    /**
     * This method simulates sending a notification.
     * It violates SRP by including communication responsibilities here.
     */
    public void sendNotification() {
        System.out.println("Notification: Your order '" + itemName + "' has been placed.");
    }
}
