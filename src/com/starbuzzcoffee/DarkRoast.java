package com.starbuzzcoffee;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		this.description = "Dark Roast";
	}

	@Override
	public double cost() {
		return .99;
	}
}
