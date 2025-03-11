public class Product implements Component{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getAtts() {
        return "Product: " + name + ", Price: " + price;
    }

    public double getTotalPrice() {
        return price;
    }
}
