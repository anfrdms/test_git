package roulette;
import java.util.*;

public class OddEven extends Bet{
	
	public void set() {
		Set<String> choices = new TreeSet<String>();
		choices.add("even");
		choices.add("odd");
		result = ConsoleReader.promptOneOf("Please bet", choices);
		wheel.spin();
	}
	
	public boolean playBet() {
		printresult();
		return wheel.getNumber() % 2 == 0 && result.equals("even") 
				|| (wheel.getNumber() % 2 == 1 && result.equals("odd"));		
	}
}
