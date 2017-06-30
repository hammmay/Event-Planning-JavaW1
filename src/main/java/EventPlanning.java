//back end
public class EventPlanning {
  private int mGuests;
/*  private String mFood;
  private String mDrinks;
  private String mEntertain;
*/

  public EventPlanning (int guests, String food, String drinks, String entertain) {
    mGuests = guests;
/*    mFood = food;
    mDrinks = drinks;
    mEntertain = entertain; */
  }

  public int getGests() {
    return mGuests;
  }

}
