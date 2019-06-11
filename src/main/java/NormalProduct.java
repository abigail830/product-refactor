public class NormalProduct extends Product {

    public static final String NORMAL = "Normal";

    public NormalProduct(Integer remainSellInDays, Integer quality) {
        super(NORMAL, remainSellInDays, quality);
    }

    public void updateRemainSellInDays() {
        this.remainSellInDays -= 1;
    }

    public void updateQuality() {
        if (this.remainSellInDays < EXPIRIED_DAY) {
            this.quality -= FAST_QUALITY_DROP_2;
        } else {
            this.quality -= COMMON_QUALITY_DROP_1;
        }

    }
}
