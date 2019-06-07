package roulette;
import java.util.*;

public class BlackRed extends Bet{

	public void set() {
		Set<String> choices = new TreeSet<String>();
		choices.add(Wheel.BLACK);
		choices.add(Wheel.RED);
		result = ConsoleReader.promptOneOf("Please bet", choices);
		wheel.spin();
	}
	
	public boolean playBet() {
		printresult();
		System.out.println(result);
		return wheel.getColor().equals(result);
	}
}
