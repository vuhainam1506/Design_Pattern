import java.util.ArrayList;
import java.util.List;

public class Table implements Component{
    List<Component> products = new ArrayList<Component>();
    public Table() {
    }
    @Override
    public String getAtts() {
        String att = "Table: \n";
        for (Component product : products) {
            att += product.getAtts() + "\n";
        }
        return att;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Component product : products) {
            totalPrice += product.getTotalPrice();
        }
        return totalPrice;
    }
    public void addProduct(Component product) {
        products.add(product);
    }
}
