package Collections.Inventory;

public class Electronics extends Item{
    private String warrenty;

    public void setWarrenty(String warrenty) {
        this.warrenty = warrenty;
    }

    public Electronics(String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
    }

}
