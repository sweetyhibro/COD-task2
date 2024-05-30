package hospitalmanagement;

public class InventoryItem {
    private String itemId;
    private String itemName;
    private int quantity;
    private double price;

    public InventoryItem(String itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters
}
