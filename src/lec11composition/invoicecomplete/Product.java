package lec11composition.invoicecomplete;

/**
   Describes a product with a description and a price.
*/
public class Product
{
   private int id;
   private String description;
   private double price;

   /**
      Constructs a product from a description and a price.
      @param description the product description
      @param price the product price
   */
   public Product(int id, String description, double price)
   {
      this.id = id;
      this.description = description;
      this.price = price;
   }

   /**
    Gets the product id.
    @return the id
    */
   public int getId() {
      return id;
   }

   /**
      Gets the product description.
      @return the description
   */
   public String getDescription()
   {  
      return description;
   }

   /**
      Gets the product price.
      @return the unit price
   */
   public double getPrice()
   {
      return price;
   }
}

