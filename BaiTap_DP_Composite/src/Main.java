public class Main {
    public static void main(String[] args) {


        Component table = new Table();
        Component product1 = new Product("Chair", 10.333, 2);
        Component product2 = new Product("Desk", 20, 1);

        ((Table) table).addProduct(product1);
        ((Table) table).addProduct(product2);

        System.out.println(table.getAtts());
        System.out.println("Total Price: " + table.getTotalPrice());
    }
}