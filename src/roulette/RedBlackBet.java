package roulette;

import util.ConsoleReader;

public class RedBlackBet extends Bet {
	private String betType;
	public RedBlackBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	public String placeBet(){
		betType=ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		return betType;
	}
	public boolean betIsMade(Wheel myWheel){
		return myWheel.getColor().equals(betType);
	}

}
