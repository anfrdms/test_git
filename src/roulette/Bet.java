package roulette;

public class Bet {
	public Wheel wheel = new Wheel();
	public String result;
	public int resultInt;
	
	public void set() {	}
	
	public boolean playBet() { return false; }
	
	public void printresult() {
		System.out.println(this.wheel.getColor() +" "+ this.wheel.getNumber());
	}
}
