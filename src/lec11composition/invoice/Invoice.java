package lec11composition.invoice;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String address;           // composition
    private List<InvoiceLineDetail> products;   // composition

    public Invoice(String address) {
        this.address = address;
        this.products = new ArrayList<>();
    }

    public void purchase(Product product, int quantity) {
        products.add(new InvoiceLineDetail(product, quantity));
    }

    public double getTotal() {
        double total = 0;
        for (InvoiceLineDetail p : products)
            total += p.getSubtotal();
        return total;
    }

    public String toString() {
        String invoice = " ------- INVOICE ------ \n";
        invoice += address + "\n\n";
        invoice += "Description      Price  Qty  Subtotal\n";

        for (InvoiceLineDetail p : products) {
            invoice += " " + p.toString() + "\n";
        }
        invoice += "\nTOTAL TO PAY: " + getTotal();
        return invoice;
    }
}
