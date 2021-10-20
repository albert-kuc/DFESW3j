package com.qa.main;

import java.util.Random;

public class SingleDiceRoll {
	
	public static int D3() {
		return new Random().nextInt(3) + 1;
	}
	
	public static int D4() {
		return new Random().nextInt(4) + 1;
	}
	
	public static int D6() {
		return new Random().nextInt(6) + 1;
	}
	
	public static int D8() {
		return new Random().nextInt(8) + 1;
	}
	
	public static int D10() {
		return new Random().nextInt(10) + 1;
	}
}
