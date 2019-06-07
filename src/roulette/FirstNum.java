package roulette;

public class FirstNum extends Bet{

	public void set() {
		resultInt = ConsoleReader.promptRange("Enter expect First number numbers", 0, 9);
		wheel.spin();

	}
	
	public boolean playBet() {
		printresult();
		return (resultInt == wheel.getNumber() %10);
	}

}
