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
}
