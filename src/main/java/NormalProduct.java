public class NormalProduct extends Product {

    public static final String NORMAL = "Normal";

    public static final int EXPIRIED_DAY = 0;

    public static final int COMMON_QUALITY_DROP_1 = 1;
    public static final int FAST_QUALITY_DROP_2 = 2;

    public NormalProduct(Integer remainSellInDays, Integer quality) {
        super(NORMAL, remainSellInDays, quality);
    }

    public void validQuality(Integer quality) {
        if (quality < MIN_QUALITY || quality > MAX_QUALITY)
            throw new IllegalArgumentException("quality should between 0 to 50.");
    }

    public void updateRemainSellInDays() {
        this.remainSellInDays -= 1;
    }

    public void updateQuality() {
        if (this.remainSellInDays <= EXPIRIED_DAY) {
            this.quality -= FAST_QUALITY_DROP_2;
        } else {
            this.quality -= COMMON_QUALITY_DROP_1;
        }

        updateQueryWhenLessThanMin();

    }
}
