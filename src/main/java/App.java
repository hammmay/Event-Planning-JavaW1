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

      Event customerEvent = new Event(intGuests, stringFood, stringDrinks, stringEntertain);

      System.out.println("Alright, here are your selections:");
      System.out.println( "----------------------" );
      System.out.println( "Total Guests: " + customerEvent.getGests() );
      System.out.println( "Guests Will Be Served: " + customerEvent.getFood() );
      System.out.println( "Drink Option: " + customerEvent.getDrink() );
      System.out.println( "Music: " + customerEvent.getEntertain() );
      System.out.println( "Here is your quote: $" + customerEvent.withoutDiscoutQuoteCalculation() );

      System.out.println("You may qualify for a deal! If you are expecting 100 or more guests, and you've included a wine package, as well as a DJ, you get the DJ for free if you enter the coupon code FREEDJ below. If you are expecting 200 or more guests, and you've included a Dinner package as well as a Live Singer, you get the Live Singer for free if you enter the code FREESINGER below:");
      String stringCoupon = myConsole.readLine();
      System.out.println( "Here is your updated quote: $" + customerEvent.withDiscountQuoteCalculation(stringCoupon) );
  }
}
