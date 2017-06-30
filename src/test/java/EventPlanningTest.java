import org.junit.*;
import static org.junit.Assert.*;

public class EventPlanningTest {

  @Test
  public void newEventPlanning_instantiatesCorrectly() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Tapas", "Juice Bar", "None");
    assertEquals(true, testEventPlanning instanceof EventPlanning);
  }

  @Test
  public void newEventPlanning_getsGuests_1() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Tapas", "Juice Bar", "None");
    assertEquals(1, testEventPlanning.getGests());
  }

  @Test
  public void newEventPlanning_getsFoodType_tapas() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Tapas", "Juice Bar", "None");
    assertEquals("Tapas", testEventPlanning.getFood());
  }

  @Test
  public void newEventPlanning_getsDrinkType_juiceBar() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Tapas", "Juice Bar", "None");
    assertEquals("Juice Bar", testEventPlanning.getDrink());
  }

  @Test
  public void newEventPlanning_getsEntertainmentType_none() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Tapas", "Juice Bar", "None");
    assertEquals("None", testEventPlanning.getEntertain());
  }

  @Test
  public void newEventPlanning_quoteCalculationFromFoodType_5() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Tapas", "Juice Bar", "None");
    assertEquals(5, testEventPlanning.foodQuoteCalculation());
  }

  @Test
  public void newEventPlanning_quoteCalculationFromFoodType_15() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Dinner", "Juice Bar", "None");
    assertEquals(15, testEventPlanning.foodQuoteCalculation());
  }

  @Test
  public void newEventPlanning_quoteCalculationFromDrinkType_5() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Tapas", "Juice Bar", "None");
    assertEquals(5, testEventPlanning.drinkQuoteCalculation());
  }

  @Test
  public void newEventPlanning_quoteCalculationFromDrinkType_10() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Tapas", "Wine", "None");
    assertEquals(10, testEventPlanning.drinkQuoteCalculation());
  }

  @Test
  public void newEventPlanning_quoteCalculationFromEntertainmentType_0() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Tapas", "Wine", "None");
    assertEquals(0, testEventPlanning.entertainQuoteCalculation());
  }

  @Test
  public void newEventPlanning_quoteCalculationFromEntertainmentType_250() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Tapas", "Wine", "DJ");
    assertEquals(250, testEventPlanning.entertainQuoteCalculation());
  }

  @Test
  public void newEventPlanning_quoteCalculationFromEntertainmentType_500() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Tapas", "Wine", "Live Singer");
    assertEquals(500, testEventPlanning.entertainQuoteCalculation());
  }

  @Test
  public void newEventPlanning_quoteCalculationFromAllInputs_515() {
    EventPlanning testEventPlanning = new EventPlanning(1, "Tapas", "Wine", "Live Singer");
    assertEquals(515, testEventPlanning.withoutDiscoutQuoteCalculation());
  }
}
