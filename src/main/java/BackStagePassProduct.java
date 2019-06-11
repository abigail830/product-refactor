public class BackStagePassProduct extends Product {

    public static final String BACK_STAGE_PASS = "BackStagePass";

    public BackStagePassProduct(Integer remainSellInDays, Integer quality) {
        super(BACK_STAGE_PASS, remainSellInDays, quality);
    }

    public void validQuality(Integer quality) {
    }

    public void updateRemainSellInDays() {
        this.remainSellInDays -= 1;
    }

    public void updateQuality() {
        if (remainSellInDays > 10)
            this.quality += 1;

        if (remainSellInDays <= 5)
            this.quality += 3;

        if (remainSellInDays > 5 && remainSellInDays <= 10)
            this.quality += 2;

        if (remainSellInDays <= 0) {
            this.quality = 0;
        }
    }

}
