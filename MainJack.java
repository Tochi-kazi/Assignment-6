import java.util.*;
// where i call classes made in the the BlackJack file
public class MainJAck {
 
 public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
  BlackJack card = new BlackJack ();
  
  
  card.push("J");
  card.push("Q");
  card.push("K");
  card.push("A");

  
  
  
  //adding number 2 to 9, four times in the arraylist
  for (int i = 2; i < 10; i++) {
   card.push(Integer.toString(i));
  }
  
  card.shuffle();
  card.Player();
  card.Dealer();
  
  while (scanner.next().equals("hit") || scanner.next().equals("stand")) {
	  if (scanner.next().equals("hit")) {
		  card.Hit();
		  card.Dealer();  
	  }else if (scanner.next().equals("stand")) {
		  System.out.print("Stop");
		  card.Stand();
		  card.Dealer();
	  }else {
		  break; 
	  }
	  
	  
  }
  
  
  /**
  while (scanner.next().equals("stand")) {
	  System.out.print("Stop");
	  card.Stand();
	  card.Dealer();
  }*/
  
  
 }
 
}
