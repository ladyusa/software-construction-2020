package lec11oodesign.invoice;

public class CashRegister {

    private Store store;
    private Invoice currentInvoice;

    public CashRegister(Store store) {
        this.store = store;
    }

    public void makeNewSale(Address address) {
        currentInvoice = new Invoice(address);
    }

    public void buy(int prodId, int quantity) {
        Product prod = store.getProduct(prodId);
        currentInvoice.addItem(prod, quantity);
    }

    public Invoice endSale() {
        return currentInvoice;
    }
}
