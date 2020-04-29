package com.julio.factory;

public class Joystick {
	public Button getButton (String option) {
		if(option.equalsIgnoreCase("O") || option.equals("0")) {
			return new Circle();
		} else if(option.equalsIgnoreCase("X")) {
			return new Cross();
		} else if(option.equalsIgnoreCase("[]")) {
			return new Square();
		} else if(option.equalsIgnoreCase("/_\\")){
			return new Triangle();
		} else {
			return null;
		}
	}
	
	
}
