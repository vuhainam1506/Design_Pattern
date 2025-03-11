public class Product implements Component{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getAtts() {
        return "Product: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}
