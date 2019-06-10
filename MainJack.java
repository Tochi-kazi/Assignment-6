/**
 * Name: Tochi Iroakazi
 * Class: ICS4U
 * Defintion: This Program runs the game of 21..
 */

import java.util.*;

public class MainJAck {
 
  public static void HitStand (BlackJack myCard) {
    Scanner scanner = new Scanner(System.in);
    //call the hit function to add another card for the player
	
    System.out.println("Type '1' each time you want to hit and '2' to stand.");
    String input = "";
    while (!(input = scanner.next()).equals("2") ) {
    	if (input.equals("1")) {
    	    System.out.println("Hit!");    	
       	 	myCard.Hit();
    	}else {
    		System.out.println("Type in '1' for hit and '2' to stand. Try Again! ");
    	}
    }
	 scanner.close();
	 System.out.println("Stand! You typed 2");
	 System.out.println(myCard.Stand()); 

    return;

  }
 public static void main(String[] args) {
	 
	 System.out.println("Type in '1' for hit and '2' to stand");
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
	  
  
  HitStand(card);
 }
 
 
}
