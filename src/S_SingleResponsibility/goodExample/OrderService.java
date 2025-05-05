package S_SingleResponsibility.goodExample;

/**
 * GOOD EXAMPLE of Single Responsibility Principle (SRP).
 * This class does only one thing:
 * - Handles business logic of order
 */
public class OrderService {
    public void makeOrder(Order order) {
        System.out.println("Order placed for: " + order.getItemName());
    }

}
