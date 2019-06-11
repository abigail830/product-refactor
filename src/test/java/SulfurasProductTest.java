import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SulfurasProductTest {

    @Test
    void test_quality_should_keep_80_and_sellIn_should_increase_1_when_date_passed() {
        //given
        final Product product = new SulfurasProduct();
        //when
        product.updateProductInfo();
        //then
        Assertions.assertEquals(80, product.getQuality());
        Assertions.assertEquals(1, product.getRemainSellInDays());
    }


}