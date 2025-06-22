package Collections.Inventory;

public class Clothing extends Item {
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public Clothing(String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
    }
}
