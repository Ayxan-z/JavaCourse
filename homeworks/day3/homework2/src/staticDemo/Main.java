package staticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 11;
        product.name = "Keyboard";

        manager.add(product);

    DatabaseHelper.Connection.createConnection();
    }
}
