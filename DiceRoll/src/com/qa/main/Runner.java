package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("D3:" + SingleDiceRoll.D3());
		System.out.println();
		
		System.out.println("FourxD6: " + DiceCalculations.FourxD6());
		System.out.println();
		
		System.out.println("TwoD10AndTwoD3(): " + DiceCalculations.TwoD10AndTwoD3());
		System.out.println();
		
		System.out.println("AddAll(): " + DiceCalculations.AddAll());
		System.out.println();
		
		System.out.println("FourD6IgnoringSmallest(): " 
					+ DiceCalculations.FourD6IgnoringSmallest());
		
	}

}
