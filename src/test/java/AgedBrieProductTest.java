import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgedBrieProductTest {

    @Test
    void test_quality_and_sellIn_should_increase_1_when_date_passed() {
        //given
        final Product product = new AgedBrieProduct(10, 20);
        //when
        product.updateProductInfo();
        //then
        Assertions.assertEquals(21, product.getQuality());
        Assertions.assertEquals(11, product.getRemainSellInDays());
    }

    @Test
    void test_quality_should_keep_as_max_when_exceed() {
        //given
        final Product product = new AgedBrieProduct(50, 50);
        //when
        product.updateProductInfo();
        //then
        Assertions.assertEquals(50, product.getQuality());
        Assertions.assertEquals(51, product.getRemainSellInDays());
    }
}