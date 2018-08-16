package intexsoft.model;

public class UserOrder {
    String userName;
    String productName;
    int productPrice;
    int ProductQuantity;

    public UserOrder() {
    }

    public UserOrder(String userName, String productName, int productPrice, int productQuantity) {
        this.userName = userName;
        this.productName = productName;
        this.productPrice = productPrice;
        ProductQuantity = productQuantity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return ProductQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        ProductQuantity = productQuantity;
    }
}
