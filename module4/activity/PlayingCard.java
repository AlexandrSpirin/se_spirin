package sef.module4.activity;

/**
 * This class represents a playing card 
 * 
 * @author John Doe
 *
 */

public class PlayingCard {

	public static final int ACE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	
	public static final int JOKER = 0;

	public static final int SPADES = 4;
	public static final int HEARTS = 3;
	public static final int DIAMONDS = 2;
	public static final int CLUBS = 1;



	/**
	 * Creates an instance of a PlayingCard given the specified parameters. Valid
	 * values for the number and suit parameters are the range of static attributes
	 * ACE to KING for number and CLUBS to SPADES for suit.  JOKER values can be 
	 * applied to suit and number.  
	 * 
	 * If a JOKER value or any invalid value is assigned to either number or
	 * suit, then both number and suit are assigned the JOKER value.
	 * 
	 * @param number the number of the card
	 * @param suit the suit of the card
	 */
	
	
	//TODO #1: Write an instance variables that will handle the Integer value of number and suit.   
	int number;
	int suit;
	//END TODO #1
	
	
	public PlayingCard(int number, int suit) {
		
		//TODO #2: Write code that will filter number and suit with the range provided above.
		// Assign the number and suit argument to instance variable respectively
		// If the arguments were not filter, make a code that will assign instance variables to a JOKER value
		switch (number) {
			case ACE:
				this.number=ACE;
				break;
			case TWO:
				this.number=TWO;
				break;
			case THREE:
				this.number=THREE;
				break;
			case FOUR:
				this.number=FOUR;
				break;
			case FIVE:
				this.number=FIVE;
				break;
			case SIX:
				this.number=SIX;
				break;
			case SEVEN:
				this.number=SEVEN;
				break;
			case EIGHT:
				this.number=EIGHT;
				break;
			case NINE:
				this.number=NINE;
				break;
			case TEN:
				this.number=TEN;
				break;
			case JACK:
				this.number=JACK;
				break;
			case QUEEN:
				this.number=QUEEN;
				break;
			case KING:
				this.number=KING;
				break;
			default:
				this.number=JOKER;
				break;
		}
		switch (suit) {
			case SPADES:
				this.suit=SPADES;
				break;
			case HEARTS:
				this.suit=HEARTS;
				break;
			case DIAMONDS:
				this.suit=DIAMONDS;
				break;
			case CLUBS:
				this.suit=CLUBS;
				break;
			default:
				this.suit=JOKER;
				break;
		}
		//END TODO #2
	}
			
	
	/**
	 * Creates an instance of a JOKER PlayingCard 
	 * 
	 */
	public PlayingCard(){

		//TODO #3: Make an instance of JOKER playing card
		// Assign instance variable to a JOKER value
		this.number=JOKER;
		this.suit=JOKER;
		//END TODO #3
	}

	/**
	 * Return the number of the card . Valid values returned can be one of the static fields of this
	 * class from ACE to KING or JOKER
	 * 
	 * @return the number 
	 */
	public int getNumber() {
		
		//TODO #4: Return the Integer value of the playing card
		// Return the value of current value of the number 
		return number;
		//END TODO #4
	}


	/**
	 * Return the suit of the card.  Valid values returned can be one of the static fields of this
	 * class from CLUBS to SPADES or JOKER
	 * 
	 * @return the suit
	 */
	public int getSuit() {

		//TODO #5: Return the Integer value of the playing card
		// Return the value of current value of the suit 
		return suit;
		//END TODO #5
	}


	/**
	 * Return a String representation of this card in the following form:
	 * "<number> of <suit>"
	 * 
	 * @return the String representation of this card
	 */
	public String toString() {
		
		//TODO #6: Make a code that will convert the Integer value of number and suit into String.
		// Return the String value of the current number and suit into a format "number of suit" 
		// Provide single space between number-of and of-suit.
		// It will be easier if a switch-case statement is use in the code. 
		// Make a code that will return the String value of JOKER if the default value was chosen
		switch (number)
		{
			case ACE:
				switch (suit) {
					case CLUBS:
						return "ACE OF CLUBS";
					case DIAMONDS:
						return "ACE OF DIAMONDS";
					case HEARTS:
						return"ACE OF HEARTS";
					case SPADES:
						return "ACE OF SPADES";
					default:
						return "JOKER";
				}
			case TWO:
				switch (suit) {
					case CLUBS:
						return "TWO OF CLUBS";
					case DIAMONDS:
						return "TWO OF DIAMONDS";
					case HEARTS:
						return"TWO OF HEARTS";
					case SPADES:
						return "TWO OF SPADES";
					default:
						return "JOKER";
				}
			case THREE:
				switch (suit) {
					case CLUBS:
						return "THREE OF CLUBS";
					case DIAMONDS:
						return "THREE OF DIAMONDS";
					case HEARTS:
						return"THREE OF HEARTS";
					case SPADES:
						return "THREE OF SPADES";
					default:
						return "JOKER";
				}
			case FOUR:
				switch (suit) {
					case CLUBS:
						return "FOUR OF CLUBS";
					case DIAMONDS:
						return "FOUR OF DIAMONDS";
					case HEARTS:
						return"FOUR OF HEARTS";
					case SPADES:
						return "FOUR OF SPADES";
					default:
						return "JOKER";
				}
			case FIVE:
				switch (suit) {
					case CLUBS:
						return "FIVE OF CLUBS";
					case DIAMONDS:
						return "FIVE OF DIAMONDS";
					case HEARTS:
						return"FIVE OF HEARTS";
					case SPADES:
						return "FIVE OF SPADES";
					default:
						return "JOKER";
				}
			case SIX:
				switch (suit) {
					case CLUBS:
						return "SIX OF CLUBS";
					case DIAMONDS:
						return "SIX OF DIAMONDS";
					case HEARTS:
						return"SIX OF HEARTS";
					case SPADES:
						return "SIX OF SPADES";
					default:
						return "JOKER";
				}
			case SEVEN:
				switch (suit) {
					case CLUBS:
						return "SEVEN OF CLUBS";
					case DIAMONDS:
						return "SEVEN OF DIAMONDS";
					case HEARTS:
						return"SEVEN OF HEARTS";
					case SPADES:
						return "SEVEN OF SPADES";
					default:
						return "JOKER";
				}
			case EIGHT:
				switch (suit) {
					case CLUBS:
						return "EIGHT OF CLUBS";
					case DIAMONDS:
						return "EIGHT OF DIAMONDS";
					case HEARTS:
						return"EIGHT OF HEARTS";
					case SPADES:
						return "EIGHT OF SPADES";
					default:return "JOKER";
				}
			case NINE:
				switch (suit) {
					case CLUBS:
						return "NINE OF CLUBS";
					case DIAMONDS:
						return "NINE OF DIAMONDS";
					case HEARTS:
						return"NINE OF HEARTS";
					case SPADES:
						return "NINE OF SPADES";
					default:
						return "JOKER";
				}
			case TEN:
				switch (suit) {
					case CLUBS:
						return "TEN OF CLUBS";
					case DIAMONDS:
						return "TEN OF DIAMONDS";
					case HEARTS:
						return"TEN OF HEARTS";
					case SPADES:
						return "TEN OF SPADES";
					default:
						return "JOKER";
				}
			case JACK:
				switch (suit) {
					case CLUBS:
						return "JACK OF CLUBS";
					case DIAMONDS:
						return "JACK OF DIAMONDS";
					case HEARTS:
						return"JACK OF HEARTS";
					case SPADES:
						return "JACK OF SPADES";
					default:
						return "JOKER";
				}
			case QUEEN:
				switch (suit) {
					case CLUBS:
						return "QUEEN OF CLUBS";
					case DIAMONDS:
						return "QUEEN OF DIAMONDS";
					case HEARTS:
						return"QUEEN OF HEARTS";
					case SPADES:
						return "QUEEN OF SPADES";
					default:
						return "JOKER";
				}
			case KING:
				switch (suit) {
					case CLUBS:
						return "KING OF CLUBS";
					case DIAMONDS:
						return "KING OF DIAMONDS";
					case HEARTS:
						return"KING OF HEARTS";
					case SPADES:
						return "KING OF SPADES";
					default:
						return "JOKER";
				}
			default:
				return "JOKER";
		}
		//END TODO #6
	}
}
