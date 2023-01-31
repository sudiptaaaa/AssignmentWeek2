package Inventory;
import java.util.*;

public class Order {
    private final int quantity;
    private final Inventory item;

    public static void main(String[] args) {
        List<Map<Integer,Inventory>> laptops = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Map<Integer,Inventory> map = new HashMap<>();
            var laptop = new Laptops(i);
            laptop.setQuantity((int)(Math.random()*10));
            map.put(i,laptop);
            laptops.add(map);
        }

        System.out.println("LAPTOPS:\n");
        for (int i = 0; i < 5; i++) {
            new Order(2,laptops.get(i).get(i)).placeOrder();
        }

        List<Map<Integer,Inventory>> accessories = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Map<Integer,Inventory> map = new HashMap<>();
            var accessory = new Accessories(i);
            accessory.setQuantity((int)(Math.random()*7));
            map.put(i,accessory);
            accessories.add(map);
        }

        System.out.println();
        System.out.println("ACCESSORIES:\n");

        for (int i = 0; i < 10; i++) {
            new Order(2,accessories.get(i).get(i)).placeOrder();
        }

    }

    public Order(int quantity, Inventory item) {
        this.quantity = quantity;
        this.item = item;
    }

    public void placeOrder() {
        if (this.item.getQuantity() >= this.quantity) {
            this.item.setQuantity(this.item.getQuantity() - this.quantity);
            generateInvoice();
        } else if (this.item.getQuantity() < this.item.getLowOrderLevelQuantity()) {
            generateRFM();
        } else {
            System.out.println("Order quantity exceeds available stock.");
        }
    }

    private void generateInvoice() {     
        System.out.println("Invoice generated");
        System.out.println(this.item.toString());

    }

    private void generateRFM() {
        // code to generate RFM
        System.out.println("RFM generated");
    }
}


/*
Output:
LAPTOPS:
Invoice generated Laptops{id=0, description='L0', quantity=4, lowOrderLevelQuantity=3}
Invoice generated Laptops{id=1, description='L1', quantity=5, lowOrderLevelQuantity=3}
RFM generated
Invoice generated Laptops{id=3, description='L3', quantity=0, lowOrderLevelQuantity=3}
Invoice generated Laptops{id=4, description='L4', quantity=3, lowOrderLevelQuantity=3}
RFM generated
Invoice generated Accessories{id=7, description='A7', quantity=4, lowOrderLevelQuantity=5}
Invoice generated Accessories{id=8, description='A8', quantity=3, lowOrderLevelQuantity=5}
Invoice generated Accessories{id=9, description='A9', quantity=2, lowOrderLevelQuantity=5}


*/
