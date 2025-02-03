package singly_linkedlist.Inventorymanagement;

public class Inventory {
    Node head;

    public void addAtbeginning(String itemName, int itemId, int quantity, double price) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }

    }

    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        Node temp = head;
        if (head == null) {
            head = newNode;
        } else {

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        temp.next = newNode;


    }

    public void addItemAtpos(String itemName, int itemId, int quantity, double price, int position) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        Node temp = head;
        if (position == 0) {
            addAtbeginning(itemName, itemId, quantity, price);
        } else {
            for (int i = 0; i < position - 1; i++) {
                if (temp.next == null) {
                    System.out.println("out of range");
                    return;
                }
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void  removeItemByID(int itemId){
        if(head== null){
            return ;
        }
        if(head.itemId==itemId){
            head=head.next;
            return;
        }
        Node temp= head;
        while(temp.next!=null){
            if(temp.next.itemId==itemId){
                temp.next=temp.next.next;
                        return ;

            }
            temp=temp.next;
        }
    }
    public void updateQuantityById(int itemId,int newQuanity){
        Node temp=head;
        while(temp!=null){
            if(temp.itemId==itemId){
                temp.quantity=newQuanity;
                return ;
            }
            temp=temp.next;
        }
    }
    public void searchItemById(int itemId){
        Node temp=head;
        while(temp!=null){
            if(temp.itemId==itemId){
                System.out.println("Item Name: "+ temp.itemName);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item not found");
    }
    public void searchByItemByName(String itemNme){
        Node temp= head;
        while(temp!=null){
            if(temp.itemName.equals(itemNme)){
                System.out.println("item name: "+temp.itemName);
                return ;
            }
            temp=temp.next;
        }
        System.out.println("Item not found ");
    }
    public double calculateTotalValue(){
        double totalValue=0;
        Node temp=head;
        while(temp!=null){
            totalValue+=temp.quantity*temp.price;
            temp=temp.next;
        }
        return totalValue;
    }
    public void sortByName() {
        Node temp = head;
        while (temp != null) {
            Node innerTemp = temp.next;
            while (innerTemp != null) {
                if (temp.itemName.compareTo(innerTemp.itemName) > 0) {
                    String tempItemName = temp.itemName;
                    int tempItemId = temp.itemId;
                    int tempQuantity = temp.quantity;
                    double tempPrice = temp.price;

                    temp.itemName = innerTemp.itemName;
                    temp.itemId = innerTemp.itemId;
                    temp.quantity = innerTemp.quantity;
                    temp.price = innerTemp.price;

                    innerTemp.itemName = tempItemName;
                    innerTemp.itemId = tempItemId;
                    innerTemp.quantity = tempQuantity;
                    innerTemp.price = tempPrice;
                }
                innerTemp = innerTemp.next;
            }
            temp = temp.next;
        }
    }
    public void sortByPrice() {
        Node temp = head;
        while (temp != null) {
            Node innerTemp = temp.next;
            while (innerTemp != null) {
                if (temp.price > innerTemp.price) {
                    String tempItemName = temp.itemName;
                    int tempItemId = temp.itemId;
                    int tempQuantity = temp.quantity;
                    double tempPrice = temp.price;

                    temp.itemName = innerTemp.itemName;
                    temp.itemId = innerTemp.itemId;
                    temp.quantity = innerTemp.quantity;
                    temp.price = innerTemp.price;

                    innerTemp.itemName = tempItemName;
                    innerTemp.itemId = tempItemId;
                    innerTemp.quantity = tempQuantity;
                    innerTemp.price = tempPrice;
                }
                innerTemp = innerTemp.next;
            }
            temp = temp.next;
        }
    }
    public void displayInventory() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Item Name: " + temp.itemName + ", Item ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}


