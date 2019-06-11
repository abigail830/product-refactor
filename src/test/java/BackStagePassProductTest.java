import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BackStagePassProductTest {

    @Test
    void test_quality_should_increase_1_when_date_passed_with_sellIn_more_than_10() {
        //given
        final Product product = new BackStagePassProduct(12, 20);
        //when
        product.updateProductInfo();
        //then
        Assertions.assertEquals(21, product.getQuality());
        Assertions.assertEquals(11, product.getRemainSellInDays());
    }

    @Test
    void test_quality_should_increase_2_when_date_passed_with_sellIn_more_than_5_and_less_than_10() {
        //given
        final Product product = new BackStagePassProduct(10, 20);
        //when
        product.updateProductInfo();
        //then
        Assertions.assertEquals(22, product.getQuality());
        Assertions.assertEquals(9, product.getRemainSellInDays());
    }

    @Test
    void test_quality_should_increase_3_when_date_passed_with_sellIn_less_than_5() {
        //given
        final Product product = new BackStagePassProduct(5, 20);
        //when
        product.updateProductInfo();
        //then
        Assertions.assertEquals(23, product.getQuality());
        Assertions.assertEquals(4, product.getRemainSellInDays());
    }

    @Test
    void test_quality_should_be_0_when_date_passed_with_sellIn_equal_or_less_than_0() {
        //given
        final Product product = new BackStagePassProduct(0, 20);
        //when
        product.updateProductInfo();
        //then
        Assertions.assertEquals(0, product.getQuality());
        Assertions.assertEquals(-1, product.getRemainSellInDays());
    }
}