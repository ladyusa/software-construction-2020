package lec11oodesign.atm.ver2bigjavabook.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A bank contains customers with bank accounts.
 */
public class Bank {

   private String name;
   private Map<Integer,Customer> customers;

   /**
    * Constructs a bank with no customers.
    */
   public Bank(String name) {
      this.name = name;
      this.customers = new HashMap<Integer,Customer>();
   }

   public void addCustomers(List<Customer> customerList) {
      for (Customer c : customerList) {
         addCustomer(c);
      }
   }

   /**
    * Adds a customer to the bank.
    * @param c the customer to add
    */
   public void addCustomer(Customer c) {
      customers.put(c.getCustomerNumber(), c);
   }
   
   /** 
    * Finds a customer in the bank.
    * @param number a customer number
    * @return the matching customer, or null if no customer
    * matches
    */
   public Customer findCustomer(int number) {
	  return customers.get(number);
   }
}
