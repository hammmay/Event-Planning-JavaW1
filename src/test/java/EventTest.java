import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(1, "Tapas", "Juice Bar", "None");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_getsGuests_1() {
    Event testEvent = new Event(1, "Tapas", "Juice Bar", "None");
    assertEquals(1, testEvent.getGests());
  }

  @Test
  public void newEvent_getsFoodType_tapas() {
    Event testEvent = new Event(1, "Tapas", "Juice Bar", "None");
    assertEquals("Tapas", testEvent.getFood());
  }

  @Test
  public void newEvent_getsDrinkType_juiceBar() {
    Event testEvent = new Event(1, "Tapas", "Juice Bar", "None");
    assertEquals("Juice Bar", testEvent.getDrink());
  }

  @Test
  public void newEvent_getsEntertainmentType_none() {
    Event testEvent = new Event(1, "Tapas", "Juice Bar", "None");
    assertEquals("None", testEvent.getEntertain());
  }

  @Test
  public void newEvent_quoteCalculationFromFoodType_5() {
    Event testEvent = new Event(1, "Tapas", "Juice Bar", "None");
    assertEquals(5, testEvent.foodQuoteCalculation());
  }

  @Test
  public void newEvent_quoteCalculationFromFoodType_15() {
    Event testEvent = new Event(1, "Dinner", "Juice Bar", "None");
    assertEquals(15, testEvent.foodQuoteCalculation());
  }

  @Test
  public void newEvent_quoteCalculationFromFoodTypeWBadInputs_0() {
    Event testEvent = new Event(1, "t", "w", "none");
    assertEquals(0, testEvent.foodQuoteCalculation());
  }
//
  @Test
  public void newEvent_quoteCalculationFromDrinkType_5() {
    Event testEvent = new Event(1, "Tapas", "Juice Bar", "None");
    assertEquals(5, testEvent.drinkQuoteCalculation());
  }

  @Test
  public void newEvent_quoteCalculationFromDrinkType_10() {
    Event testEvent = new Event(1, "Tapas", "Wine", "None");
    assertEquals(10, testEvent.drinkQuoteCalculation());
  }

  @Test
  public void newEvent_quoteCalculationFromDrinkTypeWBadInputs_0() {
    Event testEvent = new Event(1, "t", "w", "none");
    assertEquals(0, testEvent.drinkQuoteCalculation());
  }

  @Test
  public void newEvent_quoteCalculationFromEntertainmentType_0() {
    Event testEvent = new Event(1, "Tapas", "Wine", "None");
    assertEquals(0, testEvent.entertainQuoteCalculation());
  }

  @Test
  public void newEvent_quoteCalculationFromEntertainmentType_250() {
    Event testEvent = new Event(1, "Tapas", "Wine", "DJ");
    assertEquals(250, testEvent.entertainQuoteCalculation());
  }

  @Test
  public void newEvent_quoteCalculationFromEntertainmentType_500() {
    Event testEvent = new Event(1, "Tapas", "Wine", "Live Singer");
    assertEquals(500, testEvent.entertainQuoteCalculation());
  }

  @Test
  public void newEvent_quoteCalculationFromEntertainmentTypeWBadInputs_0() {
    Event testEvent = new Event(1, "t", "w", "none");
    assertEquals(0, testEvent.drinkQuoteCalculation());
  }

  @Test
  public void newEvent_quoteCalculationFromAllInputs_515() {
    Event testEvent = new Event(1, "Tapas", "Wine", "Live Singer");
    assertEquals(515, testEvent.withoutDiscoutQuoteCalculation());
  }

  @Test
  public void newEvent_quoteCalculationFromInvalidInputs_0() {
    Event testEvent = new Event(1, "t", "w", "none");
    assertEquals(0, testEvent.withoutDiscoutQuoteCalculation());
  }

  @Test
  public void newEvent_quoteCalculationFromDJDiscountCodeWProperCond_1500() {
    Event testEvent = new Event(100, "Tapas", "Wine", "DJ");
    assertEquals(1500, testEvent.withDiscountQuoteCalculation("FREEDJ"));
  }

  @Test
  public void newEvent_quoteCalculationFromDJDiscountCodeWOProperCond_1735() {
    Event testEvent = new Event(99, "Tapas", "Wine", "DJ");
    assertEquals(1735, testEvent.withDiscountQuoteCalculation("FREEDJ"));
  }

  @Test
  public void newEvent_quoteCalculationFromSingerDiscountCodeWProperCond_5000() {
    Event testEvent = new Event(200, "Dinner", "Wine", "Live Singer");
    assertEquals(5000, testEvent.withDiscountQuoteCalculation("FREESINGER"));
  }

  @Test
  public void newEvent_quoteCalculationFromSingerDiscountCodeWOProperCond_5475() {
    Event testEvent = new Event(199, "Dinner", "Wine", "Live Singer");
    assertEquals(5475, testEvent.withDiscountQuoteCalculation("FREESINGER"));
  }

  @Test
  public void newEvent_quoteCalculationBadCode_5500() {
    Event testEvent = new Event(200, "Dinner", "Wine", "Live Singer");
    assertEquals(5500, testEvent.withDiscountQuoteCalculation("badcoupon"));
  }
}
