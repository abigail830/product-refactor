public class Product {

    public static final int EXPIRIED_DAY = 0;

    public static final int COMMON_QUALITY_DROP_1 = 1;
    public static final int FAST_QUALITY_DROP_2 = 2;

    public static final int MIN_QUALITY = 0;
    public static final int MAX_QUALITY = 50;
    public static final String AGED_BRIE = "AgedBrie";
    public static final String NORMAL = "Normal";
    Integer quality;
    private String name;
    private Integer remainSellInDays;

    public Product(String name, Integer remainSellInDays, Integer quality) {
        this.name = name;
        this.remainSellInDays = remainSellInDays;
        this.quality = quality;
        validQuality(quality);
    }

    private void validQuality(Integer quality) {
        if (quality < MIN_QUALITY || quality > MAX_QUALITY)
            throw new IllegalArgumentException("quality should between 0 to 50.");
    }

    public void updateProductInfo() {
        updateRemainSellInDays();
        updateQuality();
    }

    private void updateRemainSellInDays() {
        if (this.name.equals(AGED_BRIE)) {
            this.remainSellInDays += 1;
        } else {
            this.remainSellInDays -= 1;
        }
    }

    public void updateQuality() {
        if (this.name.equals(AGED_BRIE)) {
            this.quality += 1;
        } else {
            if (this.remainSellInDays < EXPIRIED_DAY) {
                this.quality -= FAST_QUALITY_DROP_2;
            } else {
                this.quality -= COMMON_QUALITY_DROP_1;
            }
        }
        updateQueryWhenLessThanMin();
        updateQualityWhenExceedMax();
    }

    public void updateQueryWhenLessThanMin() {
        if (this.quality < MIN_QUALITY)
            this.quality = MIN_QUALITY;
    }

    public void updateQualityWhenExceedMax() {
        if (this.quality > MAX_QUALITY)
            this.quality = MAX_QUALITY;
    }


    public Integer getRemainSellInDays() {
        return remainSellInDays;
    }

    public void setRemainSellInDays(Integer remainSellInDays) {
        this.remainSellInDays = remainSellInDays;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
