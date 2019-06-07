package roulette;

public class DivideSeven extends Bet{

	public void set() {
		resultInt = ConsoleReader.promptRange("Enter expect DivideSever numbers", 0, 6);
		wheel.spin();
	}
	
	public boolean playBet() {
		printresult();
		return (resultInt == wheel.getNumber() %7);
	}
}
