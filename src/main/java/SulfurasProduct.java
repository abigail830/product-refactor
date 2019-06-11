public class SulfurasProduct extends Product {

    public static final String SULFURAS = "Sulfuras";
    public static final int FIX_QUALITY = 80;
    public static final int INIT_SELL_IN_DAYS = 60;

    public SulfurasProduct() {
        super(SULFURAS, INIT_SELL_IN_DAYS, FIX_QUALITY);
    }

    public void updateRemainSellInDays() {
        this.remainSellInDays -= 1;
    }

    public void updateQuality() {
        this.quality = FIX_QUALITY;
    }

    public void validQuality(Integer quality) {
        if (quality != FIX_QUALITY)
            throw new IllegalArgumentException("quality of Sulfuras should always 80");
    }

}
