package com.qa.main;

public class DiceCalculations {
	
	public static int FourxD6() {
		int result = 0;
		for (int i=0; i < 4; i++) {
			int throw_result = SingleDiceRoll.D6();
			System.out.println("Inside FourxD6 loop -> " + throw_result);
			result += throw_result;
		}
		return result;
	}
	
	public static int TwoD10AndTwoD3() {
		int result = 0;
		for (int i=0; i < 2; i++) {
			int D10 = SingleDiceRoll.D10();
			int D3 = SingleDiceRoll.D3();
			System.out.println("Inside TwoD10AndTwoD3() -> D10: " + D10 + ", D3: " + D3);
			result += (D10 + D3);
		}
		return result;
	}
	
	public static int AddAll() {
		int D3 = SingleDiceRoll.D3();
		int D4 = SingleDiceRoll.D4();
		int D6 = SingleDiceRoll.D6();
		int D10 = SingleDiceRoll.D10();
		int result = D3 + D4 + D6 + D10;
		System.out.println("AddAll():");
		System.out.println("D3:" + D3);
		System.out.println("D4:" + D4);
		System.out.println("D6:" + D6);
		System.out.println("D10:" + D10);
		return result;
	}
	
	public static int FourD6IgnoringSmallest() {
		int result = 0;
		int FirstD6 = SingleDiceRoll.D6();
		for (int i=0; i < 3; i++) {
			int SecondD6 = SingleDiceRoll.D6();
			System.out.println("Inside FourD6IgnoringSmallest");
			System.out.println("FirstD6: " + FirstD6 + ". SecondD6: " + SecondD6);
			if (FirstD6 < SecondD6) {
				result += SecondD6;
			} else {
				result += FirstD6;
				FirstD6 = SecondD6;
			}
		}
		return result;
				
	}

}
