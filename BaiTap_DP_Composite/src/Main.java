public class Main {
    public static void main(String[] args) {


        Component table = new Table();
        Component product1 = new Product("Chair", 20.111);
        Component product2 = new Product("Desk", 10.9);
        Component product3 = new Product("Coffee", 5.0);
        Component product4 = new Product("Tea", 3.0);

        ((Table) table).addProduct(product1);
        ((Table) table).addProduct(product2);
        ((Table) table).addProduct(product3);
        ((Table) table).addProduct(product4);

        System.out.println(table.getAtts());
        System.out.println("Total Price: " + table.getTotalPrice());
    }
}