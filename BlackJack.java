import java.util.*;

public class BlackJack {
  //Creating an Arraylist that stores Integers
  ArrayList<String> Hearts = new ArrayList<String> ();
  ArrayList<String> Spades = new ArrayList<String> ();
  ArrayList<String> Clouds = new ArrayList<String> ();
  ArrayList<String> Block = new ArrayList<String> ();
 
  String[] arr = {"Hearts", "Spades", "Clouds", "Block"};
 
 
  Random random = new Random();
 
  //System.out.println(rand1);
  int rand2 =  random.nextInt(3) + 1;
  
  //System.out.println(rand2);
  
  
  int count = 0;
  int PlayerTotal;
  int DealerTotal;
 
  //assign dealers cards
  String dealer1;
  String dealer2;
  String dealer3;
 
  //assign players cards
  String player1;
  String player2;
  String player3;
 
  // dont forget to shuffle each time after called
  public void shuffle () {
  
    Collections.shuffle(Hearts);
    Collections.shuffle(Spades);
    Collections.shuffle(Clouds);
    Collections.shuffle(Block);
    
    /**
    System.out.println(Hearts);
    System.out.println(Spades);
    System.out.println(Clouds);
    System.out.println(Block);
    */
  
  
  }
 
  public void push(String num) {
   Hearts.add(num);
   Spades.add(num);
   Clouds.add(num);
   Block.add(num);
  
  }
 
  public void clear () {
  
  }
  
  //showing players cards
  public void Player() {
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
	  
	  if (count < 1) {
		  count++;
		  Player();
	  }else {
		  System.out.println("Your total: " + PlayerTotal);
		  System.out.println();
	  }
	  
	    
  
  }
  public void Dealer () {
	 
	  int rand2 = random.nextInt(3) + 1;
	  
	  if (DealerTotal <= 16) {
		  if(arr[rand2] == ("Spades")) {
			  System.out.print("Dealers: ");
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
		  }else if (arr[rand2] == ("Clouds")) {
			  System.out.print("Dealer: Clouds ");
			  if (Clouds.get(0) == "J" ||  Clouds.get(0) == "Q" || Clouds.get(0) == "K") {
				  System.out.println(Clouds.remove(0));
				  DealerTotal += 10;
			  }else if (Clouds.get(0) ==  "A") {
				  System.out.println(Clouds.remove(0));
				  DealerTotal += 1;
				  
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
				  System.out.println(Block.remove(0));
				  DealerTotal += 1;
				  
			  }else {
				  DealerTotal += Integer.parseInt(Block.get(0));
				  System.out.println(Block.remove(0));  
			  }
			  
		  }else {
			  System.out.println("Unknown" + rand2 );
		  }
		  
		  System.out.println("Dealer Total: " + DealerTotal);
		  System.out.println();
	  }else {
		  Stand();
		  return;
	  }
	    
  
  }
  public void Hit () {
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
		
		  
	  //if player Total is 21 
	  }else if (PlayerTotal == 21) {
		  Dealer();
		  System.out.println("You Won");
	  }else {
		  Stand();
	  }
 
	  
	  
  }
  
  public void Stand () {
	  
	  
	  while (DealerTotal < 16 && DealerTotal < PlayerTotal ) {
		  Dealer();
	  }
	  
	  
	 if (DealerTotal > PlayerTotal ) {
		 if (DealerTotal <= 21) {
			 System.out.println("Busted hehe ");
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
				 System.out.println("Busted hehe ");
			 }
		 }
	 }else if (DealerTotal == PlayerTotal ) {
		 System.out.println("Push");
	 
		 
	 }
  }
 
 
 
 
}

