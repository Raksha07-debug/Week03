package singly_linkedlist.Inventorymanagement;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addAtbeginning("Apple", 1, 10, 5.0);
        inventory.addAtEnd("Banana", 2, 20, 3.0);
        inventory.addItemAtpos("Orange", 3, 15, 4.0, 1);
        inventory.displayInventory();
        inventory.removeItemByID(2);
        inventory.displayInventory();
        inventory.updateQuantityById(1, 20);
        inventory.displayInventory();
        inventory.searchItemById(3);
        inventory.searchByItemByName("Apple");
        System.out.println("Total Value: " + inventory.calculateTotalValue());
        inventory.sortByName();
        inventory.displayInventory();
        inventory.sortByPrice();
        inventory.displayInventory();
    }


}
