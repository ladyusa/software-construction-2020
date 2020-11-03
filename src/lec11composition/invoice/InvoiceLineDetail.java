package lec11composition.invoice;

public class InvoiceLineDetail {
    private Product product;  // composition
    private int quantity;     // attribute

    public InvoiceLineDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return  product.toString() +
                "  " + quantity +
                "  " + getSubtotal();
    }
}
