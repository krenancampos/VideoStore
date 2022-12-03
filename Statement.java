import java.util.Enumeration;

public abstract class Statement {
  
  abstract public String stringRentals();
  abstract public String stringBreak1();
  abstract public String stringOwe();
  abstract public String stringBreak2();
  abstract public String stringEarned();
  abstract public String stringRenterPoints();

  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      
      String result = stringRentals() + aCustomer.getName() + stringBreak1();
    
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "\n";
      }
      //add footer lines
      
      result += stringOwe() +
      String.valueOf(aCustomer.getTotalCharge()) + stringBreak2();  
      
      result += stringEarned() + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      stringRenterPoints();
    
      return result;
   }

}