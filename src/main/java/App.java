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
        return Arrays.asList(
                new NormalProduct(10, 20),
                new AgedBrieProduct(0, 10));
    }


}
