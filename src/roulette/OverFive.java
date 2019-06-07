package roulette;

public class OverFive extends Bet{

	public void set() {
		resultInt = ConsoleReader.promptRange("Enter expect First number numbers", 0, 6);
		wheel.spin();

	}
	
	public boolean playBet() {
		printresult();
		return (resultInt == wheel.getNumber() /5);
	}

}
