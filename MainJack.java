/**
 * Name: Tochi Iroakazi
 * Class: ICS4U
 * Defintion: This Program runs the game of 21..
 */

import java.util.*;

public class MainJack {
 
  public static void HitStand (BlackJack myCard) {
    Scanner scanner = new Scanner(System.in);
    //call the hit function to add another card for the player
    switch (scanner.next()){
     case "1":
    	 myCard.Hit();
   	     HitStand(myCard);
   	     
     case "2":
    	 myCard.Stand();
   	     return;
   	     
   	 default:
   		System.out.println("Type in '1' for hit and '2' to stand");
   		HitStand(myCard);		 
    }
    //add a recursion 
    HitStand(myCard);

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
