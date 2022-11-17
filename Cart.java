import java.util.Objects;

public class Cart extends Product {
    String product,
            description;
    int quantity;
    double price,
            total;
    String userName;
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cart(String product, String description, int quantity, double price, double total , String userName) {
        super(description,quantity,price);
        this.product = product;
        this.total = total;
        this.userName = userName;
    }

    public double getTotal(){
        return this.price*this.quantity;
    }

    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return quantity == cart.quantity && Double.compare(cart.price, price) == 0 && Double.compare(cart.total, total) == 0 && Objects.equals(product, cart.product) && Objects.equals(description, cart.description) && Objects.equals(userName, cart.userName);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "product='" + product + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", total=" + total +
                ", userName='" + userName + '\'' +
                '}';
    }
}

