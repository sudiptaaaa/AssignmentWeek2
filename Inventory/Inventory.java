package Inventory;

public class Inventory {
    protected int quantity;
    protected int lowOrderLevelQuantity;

    public Inventory() {
        this(0,0);
    }

    public Inventory(int i, int i1) {
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getLowOrderLevelQuantity() {
        return this.lowOrderLevelQuantity;
    }

    public void setLowOrderLevelQuantity(int lowOrderLevelQuantity) {
        this.lowOrderLevelQuantity = lowOrderLevelQuantity;
    }
}
