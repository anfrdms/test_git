package roulette;

import java.util.*;

/**
 * Plays a game of roulette.
 * 
 * @author Robert C. Duvall
 */
public class Game {

	public Bet bet;
	public String name = "game";
	public Gambler gambler = new Gambler("student01", 1000);
	
	public void play() {
		
	}
	public void gameStart() {
		System.out.println("Hello " + gambler.getName() + ", let's play "
				+ this.getName());		
	}
	public void gameEnd() {
		System.out.println("Goodbye " + gambler.getName()
		+ ", thanks for playing!");
	}
	
	public String getName() {
		return this.name;
	}


}
