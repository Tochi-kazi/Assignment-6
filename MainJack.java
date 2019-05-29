
import java.util.*;


public class MainJAck {
 
  public static void HitStand (BlackJack myCard) {
    Scanner scanner = new Scanner(System.in);
    //call the hit function to add another card for the player
    switch (scanner.nextInt()){
     case 1:
    	 myCard.Hit();
   	     HitStand(myCard);
   	     
     case 2:
    	 //myCard.Dealer();
    	 myCard.Stand();
   	     //myCard.Dealer();
   	     return;
    }
    HitStand(myCard);
    
    /**
	if (scanner.next().equals("hit")) {
	  myCard.Hit();
	  HitStand(myCard);
	}else if (scanner.next().equals("stand")) {
	  System.out.println("not");
	  myCard.Stand();
	  myCard.Dealer();
	}else {
		System.out.println("Invalid Input");
	}
	HitStand(myCard); */
  }
 public static void main(String[] args) {
	 System.out.println("Type in '1' for hit and '2' to stand");
  //Scanner scanner = new Scanner(System.in);
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
