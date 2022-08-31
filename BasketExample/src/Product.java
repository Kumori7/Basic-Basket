public class Product {
    private int id;
    private String productName;
    private int ProductPrice;

    public Product() {
    }

    public Product(String productName, int productPrice) {
        this.productName = productName;
        ProductPrice = productPrice;
    }

    public Product(int id, String productName, int productPrice) {
        this.id = id;
        this.productName = productName;
        ProductPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int productPrice) {
        ProductPrice = productPrice;
    }

    @Override
    public String toString() {
        return productName;
    }
} // end of Product class
