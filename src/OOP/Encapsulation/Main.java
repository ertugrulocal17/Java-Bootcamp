package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("ASUS Laptop");
        product.setPrice(299.90);
        product.setStockAmount(30);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getName());
        System.out.println(product.getCode());

//         Incorrect Use
//        productManager.add(1,"Computer","MSI",50,429.99);

    }
}
