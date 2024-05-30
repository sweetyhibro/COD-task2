package hospitalmanagement;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagementModule {
    private static Map<String, InventoryItem> inventory = new HashMap<>();

    public static void addInventoryItem(String itemId, String itemName, int quantity, double price) {
        InventoryItem item = new InventoryItem(itemId, itemName, quantity, price);
        inventory.put(itemId, item);
        System.out.println("Inventory item added successfully.");
    }

    // Other methods for inventory management can be added here
}
