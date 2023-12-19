package Final;

public class Product {
    //    final private int product_id = 11;
    private final int product_id;
    //    final static int category_id = 12;
    final static int category_id;

    static {
        category_id = 12;
    }

    Product(int product_id) {
        this.product_id = product_id;

    }

    public static void main(String[] args) {
        Product product = new Product(1);
        Product product2 = new Product(2);

    }
}
