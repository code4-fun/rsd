import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
    private long productId;
    private int sellerId;
    private String oriMinPrice;
    private String oriMaxPrice;
    private int promotionId;
    private int startTime;
    private int endTime;
    private int phase;
    private String productTitle;
    private String minPrice;
    private String maxPrice;
    private String discount;
    private String totalStock;
    private String stock;
    private String orders;
    private boolean soldout;
    private String productImage;
    private String productDetailUrl;
    private String trace;
    private String totalTranpro3;
    private String productPositiveRate;
    private String productAverageStar;
    private int itemEvalTotalNum;
    private int gmtCreate;

    @JsonProperty("productId")
    public long getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(long productId) {
        this.productId = productId;
    }

    @JsonProperty("sellerId")
    public int getSellerId() {
        return sellerId;
    }

    @JsonProperty("sellerId")
    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    @JsonProperty("oriMinPrice")
    public String getOriMinPrice() {
        return oriMinPrice;
    }

    @JsonProperty("oriMinPrice")
    public void setOriMinPrice(String oriMinPrice) {
        this.oriMinPrice = oriMinPrice;
    }

    @JsonProperty("oriMaxPrice")
    public String getOriMaxPrice() {
        return oriMaxPrice;
    }

    @JsonProperty("oriMaxPrice")
    public void setOriMaxPrice(String oriMaxPrice) {
        this.oriMaxPrice = oriMaxPrice;
    }

    @JsonProperty("promotionId")
    public int getPromotionId() {
        return promotionId;
    }

    @JsonProperty("promotionId")
    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    @JsonProperty("startTime")
    public int getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("endTime")
    public int getEndTime() {
        return endTime;
    }

    @JsonProperty("endTime")
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @JsonProperty("phase")
    public int getPhase() {
        return phase;
    }

    @JsonProperty("phase")
    public void setPhase(int phase) {
        this.phase = phase;
    }

    @JsonProperty("productTitle")
    public String getProductTitle() {
        return productTitle;
    }

    @JsonProperty("productTitle")
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    @JsonProperty("minPrice")
    public String getMinPrice() {
        return minPrice;
    }

    @JsonProperty("minPrice")
    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    @JsonProperty("maxPrice")
    public String getMaxPrice() {
        return maxPrice;
    }

    @JsonProperty("maxPrice")
    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    @JsonProperty("discount")
    public String getDiscount() {
        return discount;
    }

    @JsonProperty("discount")
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @JsonProperty("totalStock")
    public String getTotalStock() {
        return totalStock;
    }

    @JsonProperty("totalStock")
    public void setTotalStock(String totalStock) {
        this.totalStock = totalStock;
    }

    @JsonProperty("stock")
    public String getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(String stock) {
        this.stock = stock;
    }

    @JsonProperty("orders")
    public String getOrders() {
        return orders;
    }

    @JsonProperty("orders")
    public void setOrders(String orders) {
        this.orders = orders;
    }

    @JsonProperty("soldout")
    public boolean getSoldout() {
        return soldout;
    }

    @JsonProperty("soldout")
    public void setSoldout(boolean soldout) {
        this.soldout = soldout;
    }

    @JsonProperty("productImage")
    public String getProductImage() {
        return productImage;
    }

    @JsonProperty("productImage")
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    @JsonProperty("productDetailUrl")
    public String getProductDetailUrl() {
        return productDetailUrl;
    }

    @JsonProperty("productDetailUrl")
    public void setProductDetailUrl(String productDetailUrl) {
        this.productDetailUrl = productDetailUrl;
    }

    @JsonProperty("trace")
    public String getTrace() {
        return trace;
    }

    @JsonProperty("trace")
    public void setTrace(String trace) {
        this.trace = trace;
    }

    @JsonProperty("totalTranpro3")
    public String getTotalTranpro3() {
        return totalTranpro3;
    }

    @JsonProperty("totalTranpro3")
    public void setTotalTranpro3(String totalTranpro3) {
        this.totalTranpro3 = totalTranpro3;
    }

    @JsonProperty("productPositiveRate")
    public String getProductPositiveRate() {
        return productPositiveRate;
    }

    @JsonProperty("productPositiveRate")
    public void setProductPositiveRate(String productPositiveRate) {
        this.productPositiveRate = productPositiveRate;
    }

    @JsonProperty("productAverageStar")
    public String getProductAverageStar() {
        return productAverageStar;
    }

    @JsonProperty("productAverageStar")
    public void setProductAverageStar(String productAverageStar) {
        this.productAverageStar = productAverageStar;
    }

    @JsonProperty("itemEvalTotalNum")
    public int getItemEvalTotalNum() {
        return itemEvalTotalNum;
    }

    @JsonProperty("itemEvalTotalNum")
    public void setItemEvalTotalNum(int itemEvalTotalNum) {
        this.itemEvalTotalNum = itemEvalTotalNum;
    }

    @JsonProperty("gmtCreate")
    public int getGmtCreate() {
        return gmtCreate;
    }

    @JsonProperty("gmtCreate")
    public void setGmtCreate(int gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}