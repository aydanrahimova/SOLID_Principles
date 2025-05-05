package S_SingleResponsibility.goodExample;

/**
 * GOOD EXAMPLE of Single Responsibility Principle (SRP).
 * This class does only one thing:
 * - Manages order data
 */

// Why follow SRP?
// 1. Improves readability and understanding of code.
// 2. Makes code easier to modify, extend, and maintain.

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

}
