package S_SingleResponsibility.goodExample;

/**
 * GOOD EXAMPLE of Single Responsibility Principle (SRP).
 * This class does only one thing:
 * - Processes payments
 */
public class PaymentService {
    public void payForOrder(Order order) {
        System.out.println("Payment of $" + order.getPrice() + " processed for: " + order.getItemName());
    }
}
