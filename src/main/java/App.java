import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        final List<Product> products = importProduct();

        for (int day = 1; day < 4; day++) {
            System.out.println("Day " + day + " passed");
            products.stream().forEach(product -> {
                product.updateProductInfo();
                System.out.println(product.toString());
            });
        }
    }

    private static List<Product> importProduct() {
        return Arrays.asList(
                new NormalProduct(10, 20),
                new AgedBrieProduct(10),
                new SulfurasProduct());
    }


}
