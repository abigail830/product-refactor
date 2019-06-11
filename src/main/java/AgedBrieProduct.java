public class AgedBrieProduct extends Product {

    public static final String AGED_BRIE = "AgedBrie";

    public AgedBrieProduct(Integer quality) {
        super(AGED_BRIE, 0, quality);
    }

    public void validQuality(Integer quality) {
        if (quality < MIN_QUALITY || quality > MAX_QUALITY)
            throw new IllegalArgumentException("quality should between 0 to 50.");
    }

    public void updateRemainSellInDays() {
        this.remainSellInDays += 1;
    }

    public void updateQuality() {
        this.quality += 1;

        updateQualityWhenExceedMax();
    }

}
