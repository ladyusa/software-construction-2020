package lec11oodesign.invoice;

/**
   This program demonstrates the invoice classes by printing
   a sample invoice.
*/
public class InvoiceMain
{  
   public static void main(String[] args)
   {
      Address customerAddress
            = new Address("Kaset Cafe",
               "50 Ngamwongwan", "Bangkok", "10900");

      Store store = new Store();
      store.addProduct(1, "Coffee", 35);
      store.addProduct(2, "Green Tea", 40);
      store.addProduct(3, "Cold Milk", 30);

      CashRegister cashRegister = new CashRegister(store);
      cashRegister.makeNewSale(customerAddress);
      cashRegister.buy(1, 3);
      cashRegister.buy(2, 1);
      cashRegister.buy(3, 2);

      Invoice customerInvoice = cashRegister.endSale();

      System.out.println(customerInvoice.format());
   }
}



