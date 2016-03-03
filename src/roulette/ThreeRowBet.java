package roulette;

import util.ConsoleReader;

public class ThreeRowBet extends Bet {
	private String betChoice;
	public ThreeRowBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	public String placeBet(){
		betChoice=""+ConsoleReader.promptRange("Enter first of three consecutive numbers",1, Wheel.NUM_SPOTS - 3);
		return betChoice;
	}
	public boolean betIsMade(Wheel myWheel){
		int start = Integer.parseInt(betChoice);
		return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}
}
