public class HtmlStatement extends Statement {
  public String stringRentals(){
    return "<H1>Rentals for <EM>";
  }
  
  public String stringBreak1(){
    return "</EM></H1><P>\n"; 
  }
  
  public String stringOwe(){
   return  "<P>You owe <EM>"; 
  }
  
  public String stringBreak2(){
    return  "</EM><P>\n";
  }
  
  public String stringEarned(){
    return "On this rental you earned <EM>";
  }
  
  public String stringRenterPoints(){
    return "</EM> frequent renter points<P>";
  }
}