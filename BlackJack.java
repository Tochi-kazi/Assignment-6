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
  ArrayList<String> Clouds = new ArrayList<String> ();
  ArrayList<String> Block = new ArrayList<String> ();
 
  String[] arr = {"Hearts", "Spades", "Clouds", "Block"};
 
 
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
    Collections.shuffle(Clouds);
    Collections.shuffle(Block);
  }
 
  public void push(String num) {
	  //add numbers into the ArrayList for Hearts, Spades, Clouds and Block.
	   Hearts.add(num);
	   Spades.add(num);
	   Clouds.add(num);
	   Block.add(num);

  }

  //ask user for the value of ace 
  public int getAceValue() { 
    System.out.println("What value do you want your Ace to stand for ? (1 or 11)" );
    Scanner scanner = new Scanner(System.in);
    int myValue = scanner.nextInt(); 
    
    if (myValue !=  1 && myValue != 11){
    	getAceValue();
    }
    return myValue; 
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
	  }else if (arr[rand1] == ("Clouds")) {
		  System.out.print("You: Clouds ");
		  if (Clouds.get(0) == "J" ||  Clouds.get(0) == "Q" || Clouds.get(0) == "K") {
			  System.out.println(Clouds.remove(0));
			  PlayerTotal += 10;
		  }else if (Clouds.get(0) ==  "A") {
			  int acevalue = getAceValue();
			  PlayerTotal += acevalue;
			  System.out.println(Clouds.remove(0));
			  
		  }else {
			  PlayerTotal += Integer.parseInt(Clouds.get(0));
			  System.out.println(Clouds.remove(0));  
		  }
		//if the card is  a Block  card  
	  }else if (arr[rand1] == ("Block")) {
		  System.out.print("You: Block ");
		  if (Block.get(0) == "J" ||  Block.get(0) == "Q" || Block.get(0) == "K") {
			  System.out.println(Block.remove(0));
			  PlayerTotal += 10;
		  }else if (Block.get(0) ==  "A") {
			  int acevalue = getAceValue();
			  PlayerTotal += acevalue;
			  System.out.println(Block.remove(0));;
			  
		  }else {
			  PlayerTotal += Integer.parseInt(Block.get(0));
			  System.out.println(Block.remove(0));  
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
	  
	  if (DealerTotal <= 16) {
		  if(arr[rand2] == ("Spades")) {
			  System.out.print("Dealers: Spades ");
			  //check if they picked K, Q or J 
			  if (Spades.get(0) == "J" ||  Spades.get(0) == "Q" || Spades.get(0) == "K") {
				  System.out.println(Spades.remove(0));
				  DealerTotal += 10;
			  }else if( Spades.get(0) == "A"){
				  int aceValue = getAceValue();
				  DealerTotal += aceValue;
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
				  int aceValue = getAceValue();
				  DealerTotal += aceValue;
				  System.out.println(Hearts.remove(0));  
			  }else {
				  DealerTotal += Integer.parseInt(Hearts.get(0));
				  System.out.println(Hearts.remove(0));
			  }
			//if the card is  a Cloud  card  
		  }else if (arr[rand2] == ("Clouds")) {
			  System.out.print("Dealer: Clouds ");
			  if (Clouds.get(0) == "J" ||  Clouds.get(0) == "Q" || Clouds.get(0) == "K") {
				  System.out.println(Clouds.remove(0));
				  DealerTotal += 10;
			  }else if (Clouds.get(0) ==  "A") {
				  int aceValue = getAceValue();
				  DealerTotal += aceValue;
				  System.out.println(Clouds.remove(0));
				  
			  }else {
				  DealerTotal += Integer.parseInt(Clouds.get(0));
				  System.out.println(Clouds.remove(0));  
			  }
			//if the card is  a Block  card  
		  }else if (arr[rand2] == ("Block")) {
			  System.out.print("Dealer: Block ");
			  if (Block.get(0) == "J" ||  Block.get(0) == "Q" || Block.get(0) == "K") {
				  System.out.println(Block.remove(0));
				  DealerTotal += 10;
			  }else if (Block.get(0) ==  "A") {
				  int aceValue = getAceValue();
				  DealerTotal += aceValue;
				  System.out.println(Block.remove(0));
				  
			  }else {
				  DealerTotal += Integer.parseInt(Block.get(0));
				  System.out.println(Block.remove(0));  
			  }
			  
		  }else {
			  System.out.println("Unknown" + rand2 );
		  }
		  
		  System.out.println("Dealer Total: " + DealerTotal);
		  System.out.println();
	  //if the dealer total is greater than 16 then call the stand.
	  }else {
		  Stand();
	  }
	    
  
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
				  PlayerTotal += 1;
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
				  PlayerTotal += 1;
				  System.out.println(Hearts.remove(0));  
			  }else {
				  PlayerTotal += Integer.parseInt(Hearts.get(0));
				  System.out.println(Hearts.remove(0));
			  }
			//if the card is  a Cloud  card  
		  }else if (arr[rand1] == ("Clouds")) {
			  System.out.print("You: Clouds ");
			  if (Clouds.get(0) == "J" ||  Clouds.get(0) == "Q" || Clouds.get(0) == "K") {
				  System.out.println(Clouds.remove(0));
				  PlayerTotal += 10;
			  }else if (Clouds.get(0) ==  "A") {
				  System.out.println(Clouds.remove(0));
				  PlayerTotal += 1;
				  
			  }else {
				  PlayerTotal += Integer.parseInt(Clouds.get(0));
				  System.out.println(Clouds.remove(0));  
			  }
			//if the card is  a Block  card  
		  }else if (arr[rand1] == ("Block")) {
			  System.out.print("You: Block ");
			  if (Block.get(0) == "J" ||  Block.get(0) == "Q" || Block.get(0) == "K") {
				  System.out.println(Block.remove(0));
				  PlayerTotal += 10;
			  }else if (Block.get(0) ==  "A") {
				  System.out.println(Block.remove(0));
				  PlayerTotal += 1;
				  
			  }else {
				  PlayerTotal += Integer.parseInt(Block.get(0));
				  System.out.println(Block.remove(0));  
			  }
			  
		  }else {
			  System.out.println("Unknown" + rand1 );
		  }
		  
		  System.out.println("Your New Total: " + PlayerTotal );
		  //check if player Total became more than 21 after hit. if it did, then call the Stand function
		  if (PlayerTotal >= 21) {
			  Stand();
		  }
	  }else {
		  Stand();
	  }

	  
  }
  
  public void Stand () {
	  
	  //call the dealer function for the second card
	  Dealer();
	  
	  //keep hitting the dealer as long as the dealersTotal is less than 16, less than the playerTotal and the playerTotal is less than 21
	  while (DealerTotal < 16 && DealerTotal < PlayerTotal && PlayerTotal < 21) {
		  Dealer();
	  }
	  
	  //check for who won the game or a draw.
	 if (DealerTotal > PlayerTotal ) {
		 if (DealerTotal <= 21) {
			 System.out.println("Busted, Hehe ");
		 }else if (DealerTotal  > 21) {
			 if (PlayerTotal > 21) {
				 System.out.println("Push");
			 }else if (PlayerTotal <= 21) {
				 System.out.println("You Won");
			 }
		 }
		 
	 }else if (PlayerTotal > DealerTotal) {
		 if (PlayerTotal <= 21) {
			 System.out.println("You Won");
		 }else if (PlayerTotal > 21) {
			 if (DealerTotal > 21) {
				 System.out.println("Push");
			 }else if(DealerTotal <= 21) {
				 System.out.println("Busted, Hehe ");
			 }
		 }
	 }else if (DealerTotal == PlayerTotal ) {
		 System.out.println("Push");
	 
		 
	 }
  }
 
 
 
 
}

