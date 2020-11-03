package lec11composition.invoicecomplete;

/**
   Describes a mailing address.
*/
public class Address
{  
   private String name;
   private String street;
   private String city;
   private String zip;

   /**
      Constructs a mailing address. 
      @param aName the recipient name
      @param aStreet the street
      @param aCity the city
      @param aZip the ZIP postal code
   */
   public Address(String aName, String aStreet,
         String aCity, String aZip)
   {  
      name = aName;
      street = aStreet;
      city = aCity;
      zip = aZip;
   }   

   /**
      Formats the address.
      @return the address as a string with three lines
   */
   public String format()
   {  
      return name + "\n" + street + "\n"
            + city + ", " + " " + zip;
   }
}

