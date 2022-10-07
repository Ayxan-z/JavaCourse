package classes_with_attributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(5);
        // product.setId(1);
        product.setName("product1");
        product.setDescription("description1");
        product.setPrice(12);
        product.setStockAmount(100);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}
