/**
 * Name: Tochi Iroakazi
 * Class: ICS4U
 * Defintion: This Program runs the Game of 21.
 */


import java.util.*;

public class BlackJack {
  //Creating an Arraylist that stores Integers
  ArrayList<String> Hearts = new ArrayList<String> ();
  ArrayList<String> Spades = new ArrayList<String> ();
  ArrayList<String> Diamonds = new ArrayList<String> ();
  ArrayList<String> Clobs = new ArrayList<String> ();
 
  String[] arr = {"Hearts", "Spades", "Diamonds", "Clobs"};
 
 
  Random random = new Random();
  int rand2;
  int rand1;
  

  int count = 0;
  int PlayerTotal;
  int DealerTotal;
  
  // shuffle the ArrayList 
  public void shuffle () {
  
    Collections.shuffle(Hearts);
    Collections.shuffle(Spades);
    Collections.shuffle(Diamonds);
    Collections.shuffle(Clobs);
  }
 
  public void push(String num) {
	  //add numbers into the ArrayList for Hearts, Spades, Diamonds and Clobs.
	   Hearts.add(num);
	   Spades.add(num);
	   Diamonds.add(num);
	   Clobs.add(num);

  }

  //ask user for the value of ace 
  public int getAceValue() { 
    System.out.println("What value do you want your Ace to stand for ? (1 or 11)" );
    Scanner scanner = new Scanner(System.in);
    String myValue = scanner.next();
    //while the ace acevale value does not equal 1 or 11, keeping asking for an ace value.
    while (!myValue.contentEquals("1") && !myValue.contentEquals("11")) {
    	System.out.println("What value do you want your Ace to stand for ? (1 or 11)" );	
    	scanner = new Scanner(System.in);
    	myValue = scanner.next();
    }
    return Integer.parseInt(myValue);
  } 
  
  //showing players cards
  public void Player() {
	  rand1 = random.nextInt(3) + 1;
	  //int acevalue = 1;
	  //Scanner scanner = new Scanner(System.in);

	  
	  if(arr[rand1] == ("Spades")) {
		  System.out.print("You: Spades ");
		  //check if they picked K, Q or J 
		  if (Spades.get(0) == "J" ||  Spades.get(0) == "Q" || Spades.get(0) == "K") {
			  System.out.println(Spades.remove(0));
			  PlayerTotal += 10;
		  }else if( Spades.get(0) == "A"){
			//ask the user what value they want the ace to stand for
			  int aceValue = getAceValue();
			  PlayerTotal += aceValue;
			  System.out.println(Spades.remove(0));
		  
		  }else {
			  PlayerTotal += Integer.parseInt(Spades.get(0));
			  System.out.println(Spades.remove(0));
		  }
		  
		  
	  //if the card is  a Hearts  card
	  }else if (arr[rand1] == ("Hearts")) {
		  System.out.print("You: Hearts ");
		  if (Hearts.get(0) == "J" ||  Hearts.get(0) == "Q" || Hearts.get(0) == "K") {
			  System.out.println(Hearts.remove(0));
			  PlayerTotal += 10;
		  }else if (Hearts.get(0) == "A") {
			  int acevalue = getAceValue();
			  PlayerTotal += acevalue;
			  System.out.println(Hearts.remove(0));  
		  }else {
			  PlayerTotal += Integer.parseInt(Hearts.get(0));
			  System.out.println(Hearts.remove(0));
		  }
		//if the card is  a Cloud  card  
	  }else if (arr[rand1] == ("Diamonds")) {
		  System.out.print("You: Diamonds ");
		  if (Diamonds.get(0) == "J" ||  Diamonds.get(0) == "Q" || Diamonds.get(0) == "K") {
			  System.out.println(Diamonds.remove(0));
			  PlayerTotal += 10;
		  }else if (Diamonds.get(0) ==  "A") {
			  int acevalue = getAceValue();
			  PlayerTotal += acevalue;
			  System.out.println(Diamonds.remove(0));
			  
		  }else {
			  PlayerTotal += Integer.parseInt(Diamonds.get(0));
			  System.out.println(Diamonds.remove(0));  
		  }
		//if the card is  a Clobs  card  
	  }else if (arr[rand1] == ("Clobs")) {
		  System.out.print("You: Clobs ");
		  if (Clobs.get(0) == "J" ||  Clobs.get(0) == "Q" || Clobs.get(0) == "K") {
			  System.out.println(Clobs.remove(0));
			  PlayerTotal += 10;
		  }else if (Clobs.get(0) ==  "A") {
			  int acevalue = getAceValue();
			  PlayerTotal += acevalue;
			  System.out.println(Clobs.remove(0));
			  
		  }else {
			  PlayerTotal += Integer.parseInt(Clobs.get(0));
			  System.out.println(Clobs.remove(0));  
		  }
		  
	  }else {
		  System.out.println("Unknown" + rand1 );
	  }
	  
	  if (count < 1) {
		  count++;
		  Player();
	  }else {
		  System.out.println("Your total: " + PlayerTotal);
		  System.out.println();
	  }
	  
	    
  
  }
  //giving the Dealer a card.
  public void Dealer () {
	  rand2 = random.nextInt(3) + 1;
	  if(arr[rand2] == ("Spades")) {
		  System.out.print("Dealers: Spades ");
		  //check if they picked K, Q or J 
		  if (Spades.get(0) == "J" ||  Spades.get(0) == "Q" || Spades.get(0) == "K") {
			  System.out.println(Spades.remove(0));
			  DealerTotal += 10;
		  }else if( Spades.get(0) == "A"){
			  DealerTotal += 1;
			  System.out.println(Spades.remove(0));
		  
		  }else {
			  DealerTotal += Integer.parseInt(Spades.get(0));
			  System.out.println(Spades.remove(0));
		  }
		  
		  
	  //if the card is  a Hearts  card
	  }else if (arr[rand2] == ("Hearts")) {
		  System.out.print("Dealer: Hearts ");
		  if (Hearts.get(0) == "J" ||  Hearts.get(0) == "Q" || Hearts.get(0) == "K") {
			  System.out.println(Hearts.remove(0));
			  DealerTotal += 10;
		  }else if (Hearts.get(0) == "A") {
			  DealerTotal += 1;
			  System.out.println(Hearts.remove(0));  
		  }else {
			  DealerTotal += Integer.parseInt(Hearts.get(0));
			  System.out.println(Hearts.remove(0));
		  }
		//if the card is  a Cloud  card  
	  }else if (arr[rand2] == ("Diamonds")) {
		  System.out.print("Dealer: Diamonds ");
		  if (Diamonds.get(0) == "J" ||  Diamonds.get(0) == "Q" || Diamonds.get(0) == "K") {
			  System.out.println(Diamonds.remove(0));
			  DealerTotal += 10;
		  }else if (Diamonds.get(0) ==  "A") {
			  DealerTotal += 1;
			  System.out.println(Diamonds.remove(0));
			  
		  }else {
			  DealerTotal += Integer.parseInt(Diamonds.get(0));
			  System.out.println(Diamonds.remove(0));  
		  }
		//if the card is  a Clobs  card  
	  }else if (arr[rand2] == ("Clobs")) {
		  System.out.print("Dealer: Clobs ");
		  if (Clobs.get(0) == "J" ||  Clobs.get(0) == "Q" || Clobs.get(0) == "K") {
			  System.out.println(Clobs.remove(0));
			  DealerTotal += 10;
		  }else if (Clobs.get(0) ==  "A") {
			  DealerTotal += 1;
			  System.out.println(Clobs.remove(0));
			  
		  }else {
			  DealerTotal += Integer.parseInt(Clobs.get(0));
			  System.out.println(Clobs.remove(0));  
		  }
		  
	  }else {
		  System.out.println("Unknown" + rand2 );
	  }
	  
	  System.out.println("Dealer Total: " + DealerTotal);
	  System.out.println();
  
  }
  public void Hit () {
	  //pick another card for the user 
	  if (PlayerTotal < 21) {
		  int rand1 = random.nextInt(3) + 1;
		  
		  if(arr[rand1] == ("Spades")) {
			  System.out.print("You: Spades ");
			  //check if they picked K, Q or J 
			  if (Spades.get(0) == "J" ||  Spades.get(0) == "Q" || Spades.get(0) == "K") {
				  System.out.println(Spades.remove(0));
				  PlayerTotal += 10;
			  }else if( Spades.get(0) == "A"){
				  int acevalue = getAceValue();
				  PlayerTotal += acevalue;
				  System.out.println(Spades.remove(0));
			  
			  }else {
				  PlayerTotal += Integer.parseInt(Spades.get(0));
				  System.out.println(Spades.remove(0));
			  }
			  
			  
		  //if the card is  a Hearts  card
		  }else if (arr[rand1] == ("Hearts")) {
			  System.out.print("You: Hearts ");
			  if (Hearts.get(0) == "J" ||  Hearts.get(0) == "Q" || Hearts.get(0) == "K") {
				  System.out.println(Hearts.remove(0));
				  PlayerTotal += 10;
			  }else if (Hearts.get(0) == "A") {
				  int acevalue = getAceValue();
				  PlayerTotal += acevalue;
				  System.out.println(Hearts.remove(0));;  
			  }else {
				  PlayerTotal += Integer.parseInt(Hearts.get(0));
				  System.out.println(Hearts.remove(0));
			  }
			//if the card is  a Cloud  card  
		  }else if (arr[rand1] == ("Diamonds")) {
			  System.out.print("You: Diamonds ");
			  if (Diamonds.get(0) == "J" ||  Diamonds.get(0) == "Q" || Diamonds.get(0) == "K") {
				  System.out.println(Diamonds.remove(0));
				  PlayerTotal += 10;
			  }else if (Diamonds.get(0) ==  "A") {
				  int acevalue = getAceValue();
				  PlayerTotal += acevalue;
				  System.out.println(Diamonds.remove(0));
				  
			  }else {
				  PlayerTotal += Integer.parseInt(Diamonds.get(0));
				  System.out.println(Diamonds.remove(0));  
			  }
			//if the card is  a Clobs  card  
		  }else if (arr[rand1] == ("Clobs")) {
			  System.out.print("You: Clobs ");
			  if (Clobs.get(0) == "J" ||  Clobs.get(0) == "Q" || Clobs.get(0) == "K") {
				  System.out.println(Clobs.remove(0));
				  PlayerTotal += 10;
			  }else if (Clobs.get(0) ==  "A") {
				  int acevalue = getAceValue();
				  PlayerTotal += acevalue;
				  System.out.println(Clobs.remove(0));
				  
			  }else {
				  PlayerTotal += Integer.parseInt(Clobs.get(0));
				  System.out.println(Clobs.remove(0));  
			  }
			  
		  }else {
			  System.out.println("Unknown" + rand1 );
		  }
		  
		  System.out.println("Your New Total: " + PlayerTotal );
		  //check if player Total became more than 21 after hit. if it did, then call the Stand function 
	  }else {
//		  System.out.println(Stand() + "diff stuff ");
		  System.out.println("You already busted...what are you thining? ");
	  }

	  
  }
  
  public String Stand () {
	  
	  System.out.println("The Dealers Second card");
	  Dealer();
	  //keep hitting the dealer as long as the dealersTotal is less than 16, less than the playerTotal and the playerTotal is less than 21
	  while  (DealerTotal < 16 && DealerTotal < PlayerTotal && PlayerTotal < 21){
		  System.out.println("Here we go again");
		  Dealer();
	  }
	  
	  //check for who won the game or a draw.
	 if (DealerTotal > PlayerTotal ) {
		 if (DealerTotal <= 21) {
			 //System.out.println("Lose, Hehe ");
			 return "Lose, Hehe ";
		 }else if (DealerTotal  > 21) {
			 if (PlayerTotal > 21) {
				 //System.out.println("Push");
				 return "Push";
			 }else if (PlayerTotal <= 21) {
				 //System.out.println("You Won");
				 return "You .Won";
			 }
		 }else {
			 return "Cant  find ";
		 }
		 
	 }else if (PlayerTotal > DealerTotal) {
		 if (PlayerTotal <= 21) {
			 //System.out.println("You Won");
			 return "You Won";
		 }else if (PlayerTotal > 21) {
			 if (DealerTotal > 21) {
				 //System.out.println("Push");
				 return "Push";
			 }else if(DealerTotal <= 21) {
				 //System.out.println("Lose, Hehe ");
				 return "Lose, Hehe ";
			 }
		 }
	 }else if (DealerTotal == PlayerTotal ) {
		 //System.out.println("Push");
		 return "Push";
	 
		 
	 }else {
		 return "Cant find ";
	 }
	 
	 return "Done";
  }
  
  
 
 
 
 
}
