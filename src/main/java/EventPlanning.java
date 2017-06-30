//back end
public class EventPlanning {
  public int mGuests;
  public String mFood;
  public String mDrinks;
  public String mEntertain;

  public EventPlanning (int guests, String food, String drinks, String entertain) {
    mGuests = guests;
    mFood = food;
    mDrinks = drinks;
    mEntertain = entertain;
  }

  public int getGests() {
    return mGuests;
  }

  public String getFood() {
    return mFood;
  }

  public String getDrink() {
    return mDrinks;
  }

  public String getEntertain() {
    return mEntertain;
  }

  public int foodQuoteCalculation() {
    if (mFood.equals("Tapas")){
     return (mGuests * 5);
    } else if (mFood.equals("Dinner")){
    } return (mGuests * 15);
  }

  public int drinkQuoteCalculation() {
    if (mDrinks.equals("Juice Bar")){
     return (mGuests * 5);
   } else if (mDrinks.equals("Wine")){
   } return (mGuests * 10);
  }


}
