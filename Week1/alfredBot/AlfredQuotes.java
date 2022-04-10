
import java.util.Date;

public class AlfredQuotes {
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String guestString = "Hello you are most welcome";
        return String.format("%s %s",guestString, name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date currentDate = new Date();
        return String.format("It is currently %s", currentDate);
    }
    
    public String respondBeforeAlexis(String conversation) {
        //creating a snarky response
        String snarkyResponse = "Of course! Please forgive her she can only understand the simplest of things";
        //creating Alfred's response
        String alfredResponse = "Why certainly sir! Your wish is my command!";
        if(conversation.indexOf("Alexis") >= 0){
            return snarkyResponse;
        }
        if(conversation.indexOf("Alfred") >= 0){
            return alfredResponse;
        }
        else{
            return "Well with that I bid you goodbye and if you shall require my help please dont hesitate to call on Alfred";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
