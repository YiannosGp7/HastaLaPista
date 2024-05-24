public class Product {
    private int productId;
    private String productType;
    private double price;
    private String info;

    // Constructor
    public Product(int productId, String productType, double price, String info) {
        this.productId = productId;
        this.productType = productType;
        this.price = price;
        this.info = info;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
