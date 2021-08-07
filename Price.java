public abstract class Price {
   public abstract int getPriceCode();
   
   //determine amounts for each line
   public abstract double getCharge(int daysRented);
   
   public int getFrequentRenterPoints(int daysRented){
    return 1;
  }
}
