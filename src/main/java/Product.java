public abstract class Product {

    public static final int MIN_QUALITY = 0;
    public static final int MAX_QUALITY = 50;

    Integer quality;
    private String name;
    Integer remainSellInDays;

    public Product(String name, Integer remainSellInDays, Integer quality) {
        this.name = name;
        this.remainSellInDays = remainSellInDays;
        this.quality = quality;
        validQuality(quality);
    }

    public abstract void validQuality(Integer quality);

    public void updateProductInfo() {

        updateRemainSellInDays();
        updateQuality();
    }

    public abstract void updateRemainSellInDays();

    public abstract void updateQuality();

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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name +
                ", quality=" + quality + '\'' +
                ", remainSellInDays=" + remainSellInDays +
                '}';
    }
}
