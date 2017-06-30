//front end
import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();


    System.out.println("Welcome to Minimalist Catering! If you're looking for a quote, please enter the number of guests you're expecting:");
    String stringGuests = myConsole.readLine();
    int intGuests = Integer.parseInt(stringGuests);

    System.out.println("Great! We offer a Tapas service for $5 per guest, or a full Dinner service for $15 per guest. Would you like Tapas or Dinner?");
    String stringFood = myConsole.readLine();

    System.out.println("Excellent choice. We offer a a Juice Bar for $5 per guest, or a Wine service for $10 per guest. Would you like a Juice Bar or Wine?");
    String stringDrinks = myConsole.readLine();

    System.out.println("And finally, the music. For only $250, you get a DJ spinning tunes from his iPad, or for $500 you get a live singer, but these are optional additions. Would you like a DJ, a Live Singer, or None?");
    String stringEntertain = myConsole.readLine();

    EventPlanning eventPlanning = new EventPlanning(intGuests, stringFood, stringDrinks, stringEntertain);

    System.out.println("Alright, here are your selections:");
    System.out.println( "----------------------" );
    System.out.println( eventPlanning.mGuests );
    System.out.println( eventPlanning.mFood );
    System.out.println( eventPlanning.mDrinks );
    System.out.println( eventPlanning.mEntertain );




  }
}
