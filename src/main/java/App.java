import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        final List<Product> products = importProduct();

        while (true) {
            products.stream()
                    .forEach(product -> product.updateProductInfo());

        }
    }

    private static List<Product> importProduct() {
        return Arrays.asList(new Product(Product.NORMAL, 10, 20));
    }


}
