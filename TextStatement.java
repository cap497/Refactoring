public class TextStatement extends Statement {
  public String result(Customer aCustomer) {
     return "Rental Record for " + aCustomer.getName() + "\n";
   }

   public String incrementResult(String result, Rental each) {
     return result + "\t" + each.getMovie().getTitle()+ "\t" +
            String.valueOf(each.getCharge()) + "\n";
   }

   public String addFooterLines(String result, Customer aCustomer) {
     result += "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
     result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
             " frequent renter points";
     return result;
   }
}
