


import java.util.*;


public class MainJAck {
 
 public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
  BlackJack card = new BlackJack ();
  
  //push the letter K,Q,J and A into the arrayList
  card.push("J");
  card.push("Q");
  card.push("K");
  card.push("A");


  //adding number 2 to 9, four times in the arrayList
  for (int i = 2; i < 10; i++) {
   card.push(Integer.toString(i));
  }
  
  card.shuffle();
  card.Player();
  card.Dealer();
  
  while (scanner.next().equals("hit")) {
	  card.Hit();
	  
  }
	  
  while (scanner.next().equals("stand")) {
	  card.Stand();
	  card.Dealer();
  }
  
  
 }
 
}
