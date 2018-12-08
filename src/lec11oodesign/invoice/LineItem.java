package lec11oodesign.invoice;

/**
   Describes a quantity of an article to purchase.
*/
public class LineItem
{  
   private int quantity;
   private Product theProduct;

   /**
      Constructs an item from the product and quantity.
      @param aProduct the product
      @param aQuantity the item quantity
   */
   public LineItem(Product aProduct, int aQuantity)
   {  
      theProduct = aProduct;
      quantity = aQuantity;
   }
   
   /**
      Computes the subtotal cost of this line item.
      @return the subtotal price
   */
   public double getSubtotal()
   {  
      return theProduct.getPrice() * quantity;
   }
   
   /**
      Formats this item.
      @return a formatted string of this item
   */
   public String format()
   {  
      return String.format("%-30s%8.2f%5d%8.2f", 
         theProduct.getDescription(), theProduct.getPrice(), 
         quantity, getSubtotal());
   }
}
