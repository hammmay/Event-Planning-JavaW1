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
  public void newEvent_quoteCalculationFromAllInputs_515() {
    Event testEvent = new Event(1, "Tapas", "Wine", "Live Singer");
    assertEquals(515, testEvent.withoutDiscoutQuoteCalculation());
  }
}
