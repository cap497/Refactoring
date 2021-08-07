import java.util.Enumeration;

public abstract class Statement {
  public abstract String result(Customer aCustomer);
  public abstract String incrementResult(String result, Rental each);
  public abstract String addFooterLines(String result, Customer aCustomer);

  public String value(Customer aCustomer) {
     Enumeration rentals = aCustomer.getRentals();
     String result = result(aCustomer);
     while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();
        //show figures for this rental
        result = incrementResult(result,each);
     }
     result = addFooterLines(result,aCustomer);
     
     return result;
   }
}
