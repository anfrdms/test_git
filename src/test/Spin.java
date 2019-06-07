package test;

import static org.junit.Assert.*;

import org.junit.Test;

import roulette.*;

public class Spin {

	Bet bet = new Bet();
	
	@Test
	public void testBlackRed() {
		bet = new BlackRed();
		bet.result = "red";
		bet.wheel.myValue = 1; //red
		assert(bet.playBet());
	}
	@Test
	public void testBlackRed2() {
		bet = new BlackRed();
		bet.result = "black";
		bet.wheel.myValue = 1; //red
		assert(!bet.playBet());
	}
	@Test
	public void OddEven() {
		bet = new OddEven();
		bet.result = "odd";
		bet.wheel.myValue = 1; //red
		assert(bet.playBet());
	}
	@Test
	public void OddEven2() {
		bet = new OddEven();
		bet.result = "odd";
		bet.wheel.myValue = 2; //red
		assert(!bet.playBet());
	}
	@Test
	public void ThreeRow() {
		bet = new ThreeRow();
		bet.resultInt = 1;
		bet.wheel.myValue = 3; //red
		assert(bet.playBet());
	}
	@Test
	public void ThreeRow2() {
		bet = new ThreeRow();
		bet.resultInt = 1;
		bet.wheel.myValue = 4; //red
		assert(!bet.playBet());
	}
	
	@Test
	public void DivideSeven() {
		bet = new DivideSeven();
		bet.resultInt = 1;
		bet.wheel.myValue = 1; //red
		assert(bet.playBet());
	}
	@Test
	public void DivideSeven2() {
		bet = new DivideSeven();
		bet.resultInt = 1;
		bet.wheel.myValue = 2; //red
		assert(!bet.playBet());
	}
	@Test
	public void FirstNum() {
		bet = new FirstNum();
		bet.resultInt = 1;
		bet.wheel.myValue = 1; //red
		assert(bet.playBet());
	}
	@Test
	public void FirstNum2() {
		bet = new FirstNum();
		bet.resultInt = 1;
		bet.wheel.myValue = 2; //red
		assert(!bet.playBet());
	}
	@Test
	public void OverFive() {
		bet = new OverFive();
		bet.resultInt = 0;
		bet.wheel.myValue = 1; //red
		assert(bet.playBet());
	}
	@Test
	public void OverFive2() {
		bet = new OverFive();
		bet.resultInt = 1;
		bet.wheel.myValue = 1; //red
		assert(!bet.playBet());
	}



}
