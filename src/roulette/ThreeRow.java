package roulette;

public class ThreeRow extends Bet{

	public void set() {
		resultInt = ConsoleReader.promptRange("Enter first of three consecutive numbers", 1, 34);
		wheel.spin();
	}
	
	public boolean playBet() {
		printresult();
		return (resultInt <= wheel.getNumber() && wheel.getNumber() < resultInt + 3);
	}
}
