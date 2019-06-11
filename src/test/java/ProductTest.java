import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void test_quality_and_sellIn_should_reduce_1_when_date_passed() {
        //given
        final Product product = new Product(Product.NORMAL, 10, 20);
        //when
        product.updateProductInfo();
        //then
        Assertions.assertEquals(19, product.getQuality());
        Assertions.assertEquals(9, product.getRemainSellInDays());
    }

    @Test
    void test_quality_should_reduce_2_when_sellIn_date_expiried() {
        //given
        final Product product = new Product(Product.NORMAL, 0, 2);
        //when
        product.updateProductInfo();
        //then
        Assertions.assertEquals(0, product.getQuality());
        Assertions.assertEquals(-1, product.getRemainSellInDays());
    }

    @Test
    void test_quality_should_remain_0_when_date_pass() {
        //given
        final Product product = new Product(Product.NORMAL, 0, 0);
        //when
        product.updateProductInfo();
        //then
        Assertions.assertEquals(0, product.getQuality());
        Assertions.assertEquals(-1, product.getRemainSellInDays());
    }

    @Test
    void test_quality_should_within_50() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            final Product product = new Product(Product.NORMAL, 0, 51);
        });

    }

    @Test
    void test_quality_should_bigger_than_0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            final Product product = new Product(Product.NORMAL, 0, -1);
        });
    }

    @Test
    void test_quality_and_sellIn_should_increase_1_when_date_passed() {
        //given
        final Product product = new Product(Product.AGED_BRIE, 10, 20);
        //when
        product.updateProductInfo();
        //then
        Assertions.assertEquals(21, product.getQuality());
        Assertions.assertEquals(11, product.getRemainSellInDays());
    }
}