package lec11composition.invoice;

/**
   This program demonstrates the invoice classes by printing
   a sample invoice.
*/
public class InvoicePrinter
{  
   public static void main(String[] args)
   {
      // test only for invoices
      Address samsAddress 
            = new Address("Sam's Small Appliances",
               "100 Main Street", "Anytown", "98765");

      Invoice samsInvoice = new Invoice(samsAddress);
      samsInvoice.addItem(new Product(1, "Toaster", 29.95), 3);
      samsInvoice.addItem(new Product(2, "Hair dryer", 24.95), 1);
      samsInvoice.addItem(new Product(3, "Car vacuum", 19.99), 2);

      System.out.println(samsInvoice.format());           
   }
}



