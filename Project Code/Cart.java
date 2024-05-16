import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private double totalPrice;

    // Constructor
    public Cart() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    // Getters and Setters
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
        calculateTotalPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    // Actions
    public void addItem(Product product) {
        products.add(product);
        calculateTotalPrice();
        System.out.println("Product added to cart: " + product.getProductType());
    }

    public void removeItem(Product product) {
        products.remove(product);
        calculateTotalPrice();
        System.out.println("Product removed from cart: " + product.getProductType());
    }

    public void viewItems() {
        System.out.println("Items in the cart:");
        for (Product product : products) {
            System.out.println("- " + product.getProductType() + ": " + product.getInfo());
        }
    }

    public void checkout() {
        System.out.println("Checkout initiated. Total price: $" + totalPrice);
        // Implement checkout logic here
    }

    // Helper method to calculate total price
    private void calculateTotalPrice() {
        totalPrice = 0.0;
        for (Product product : products) {
            // Assuming product has a method getPrice() to get the price
            totalPrice += product.getPrice();
        }
    }
}
