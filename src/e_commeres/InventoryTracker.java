/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e_commeres;

/**
 *
 * @author Khush Patel
 */
public class InventoryTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Trackking Inventory......");
    }
    
    public void checkStockLevel(String itemName, int quantity) {
    System.out.println("Checking stock for: " + itemName);
    System.out.println("Available quantity: " + quantity);
    }
    
    public void alertLowStock(String itemName, int quantity) {
    if (quantity < 5) {
        System.out.println("Alert: Low stock for " + itemName);
    } else {
        System.out.println(itemName + " stock level is sufficient.");
    }
    }
    
}
