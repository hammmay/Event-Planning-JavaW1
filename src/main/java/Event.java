//back end
public class Event {
  private int mGuests;
  private String mFood;
  private String mDrinks;
  private String mEntertain;

  public Event (int guests, String food, String drinks, String entertain) {
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
    if (mFood.equals("Tapas"))
    {
      return (mGuests * 5);
    }
    else if (mFood.equals("Dinner"))
    {
      return (mGuests * 15);
    }
    else
    {
      return 0;
    }
  }

  public int drinkQuoteCalculation() {
    if (mDrinks.equals("Juice Bar"))
    {
      return (mGuests * 5);
    }
    else if (mDrinks.equals("Wine"))
    {
      return (mGuests * 10);
    }
    else
    {
      return 0;
    }
  }

  public int entertainQuoteCalculation() {
    if (mEntertain.equals("None"))
    {
      return 0;
    }
    else if (mEntertain.equals("DJ"))
    {
      return 250;
    }
    else if (mEntertain.equals("Live Singer"))
    {
      return 500;
    }
    else
    {
      return 0;
    }
  }

  public int withoutDiscoutQuoteCalculation() {
    return (foodQuoteCalculation() + drinkQuoteCalculation() + entertainQuoteCalculation());
  }

  public int withDiscountQuoteCalculation(String couponCode) {
    if (couponCode.equals("FREEDJ") && mGuests >= 100 && mDrinks.equals("Wine") && mEntertain.equals("DJ"))
    {
      return (withoutDiscoutQuoteCalculation() - 250);
    }
    else if (couponCode.equals("FREESINGER") && mGuests >= 200 && mFood.equals("Dinner") && mEntertain.equals("Live Singer"))
    {
      return (withoutDiscoutQuoteCalculation() - 500);
    }
    else
    {
      return withoutDiscoutQuoteCalculation();
    }
  }


}
