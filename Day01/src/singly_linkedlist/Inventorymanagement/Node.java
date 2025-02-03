package singly_linkedlist.Inventorymanagement;

public class Node {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Node next;

    Node(String itemName,int itemId,int quantity,double price){
        this.itemName=itemName;
        this.itemId=itemId;
        this.quantity=quantity;
        this.price=price;
        this.next=null;
    }

}
