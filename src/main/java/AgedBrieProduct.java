public class AgedBrieProduct extends Product {

    public static final String AGED_BRIE = "AgedBrie";

    public AgedBrieProduct(Integer remainSellInDays, Integer quality) {
        super(AGED_BRIE, remainSellInDays, quality);
    }

    public void updateRemainSellInDays() {
        this.remainSellInDays += 1;
    }

    public void updateQuality() {
        this.quality += 1;
    }

}
