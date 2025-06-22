package Collections.Inventory;

public class Book extends Item {
    private String authorId;

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public Book(String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
    }
}
