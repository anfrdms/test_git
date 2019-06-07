package roulette;

public class Roulette extends Game{
	public Bet bet;
	public String name = "Roulette";
	public Gambler gambler = new Gambler("student01", 1000);
	public boolean check = true;
	public int cost;
	
	public void play()
	{		
		this.gameStart();
		promptForBet();
		while(check&&gambler.isSolvent()) {
			setCost();
			setAndPlay();
			promptForBet();			
		}
		this.gameEnd();
	}
	
	public void setAndPlay() {
		bet.set();
		if(bet.playBet()) {
			System.out.println("You Win");
			gambler.updateBankroll(cost);
		}
		else {
			System.out.println("You Lose");
			gambler.updateBankroll(cost*(-1));
		}
	}
	
	public void setCost() {
		cost = ConsoleReader.promptRange("How much do you want to bet", 0, gambler.getBankroll());
	}
	
	private void promptForBet() {
		System.out.println("You can make one of the following types of bets or exit:");
		System.out.println("0. exit:");
		System.out.println("1. black or red");
		System.out.println("2. odd or even");
		System.out.println("3. three is row");
		System.out.println("4. FirstNum");
		System.out.println("5. DivideSeven");
		System.out.println("6. OverFive");
		
		int i = ConsoleReader.promptRange("Please make a choice", 0, 6);
		
		if(i == 0) check = false;
		else if(i == 1) bet = new BlackRed();
		else if(i == 2) bet = new OddEven();
		else if(i == 3) bet = new ThreeRow();
		else if(i == 4) bet = new FirstNum();
		else if(i == 5) bet = new DivideSeven();
		else if(i == 6) bet = new OverFive();
	}

}
