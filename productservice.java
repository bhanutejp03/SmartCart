import java.util.*;

public class ProductService {

    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Wireless Noise-Canceling Headphones", "Electronics", 24999,
                "image1.jpg", "Premium headphones"));
        products.add(new Product(2, "Smartwatch Series 5", "Electronics", 15999,
                "image2.jpg", "Fitness smartwatch"));
        products.add(new Product(3, "Cotton T-Shirt", "Fashion", 999,
                "image3.jpg", "Comfortable t-shirt"));
        products.add(new Product(4, "Aviator Sunglasses", "Fashion", 2999,
                "image4.jpg", "Stylish sunglasses"));
    }

    // GET ALL PRODUCTS
    public static List<Product> getProducts() {
        return products;
    }

    // GET BY ID
    public static Product getProductById(int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    // ADD PRODUCT
    public static void addProduct(Product p) {
        int newId = products.size() + 1;
        p = new Product(newId, p.getName(), p.getCategory(),
                p.getPrice(), p.getImage(), p.getDescription());
        products.add(p);
    }

    // UPDATE PRICE
    public static boolean updateProductPrice(int id, int newPrice) {
        Product p = getProductById(id);
        if (p != null) {
            p.setPrice(newPrice);
            return true;
        }
        return false;
    }

    // DELETE PRODUCT
    public static void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}