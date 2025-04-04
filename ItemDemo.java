class Item {
    // Static variable to keep track of the number of objects created
    static int objectCount = 0;
    
    // Instance variable for the item's name
    String itemName;

    // Constructor to initialize the itemName and increment objectCount
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;  // Increment the object count each time an object is created
    }

    // Method to display the item name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }

    // Static method to display the total number of objects created
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        // Creating Item objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Displaying the items
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Displaying the total number of objects created
        Item.displayObjectCount();
    }
}
