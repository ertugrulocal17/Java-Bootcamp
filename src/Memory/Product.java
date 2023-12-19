package Memory;

public class Product {
    int id; // instance variable
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Product builder(int id,String name){
        return new Product(id,name);
    }

    public static void main(String[] args) {
        int id = 12;
        String name = "Shirt";
        Product product = null;
        product = builder(id,name);

        String names = "John";
        String names2 = "John";
        String names3 = new String("John");
        System.out.println(names == names2);
        System.out.println(names == names3);

    }
}
