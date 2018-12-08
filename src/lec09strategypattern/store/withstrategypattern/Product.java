package lec09strategypattern.store.withstrategypattern;

/**
   Describes a product with a name and a price.
*/
public class Product
{
   private String name;
   private String type;
   private double price;
   private int quantity;

   public Product(String name,  String type, double price, int qty) {
      this.type = type;
      this.name = name;
      this.price = price;
      this.quantity = qty;
   }

   public String getName()
   {  
      return name;
   }
   public double getPrice()
   {
      return price;
   }
   public int getQuantity() {
      return quantity;
   }
   public String getType() {
      return type;
   }
}

