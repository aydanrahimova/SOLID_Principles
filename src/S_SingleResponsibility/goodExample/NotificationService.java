package S_SingleResponsibility.goodExample;

/**
 * GOOD EXAMPLE of Single Responsibility Principle (SRP).
 * This class does only one thing:
 * - Sends notifications
 */
public class NotificationService {
    public void sendNotification(Order order) {
        System.out.println("Notification: Your order '" + order.getItemName() + "' has been placed.");
    }
}
