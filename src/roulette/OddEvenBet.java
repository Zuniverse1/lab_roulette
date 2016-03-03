package roulette;

import util.ConsoleReader;

public class OddEvenBet extends Bet {
	private String betType;

	public OddEvenBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	public String placeBet(){
		betType=ConsoleReader.promptOneOf("Please bet", "even", "odd");
		return betType;
	}
	public boolean betIsMade(Wheel myWheel){
		return (myWheel.getNumber() % 2 == 0 && betType.equals("even")) ||
                (myWheel.getNumber() % 2 == 1 && betType.equals("odd"));
	}

}
