//back end
public class EventPlanning {
  public int mGuests;
  public String mFood;
  public String mDrinks;
  public String mEntertain;
  public int mQuote;


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
}
