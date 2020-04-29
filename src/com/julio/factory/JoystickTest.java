package com.julio.factory;

import java.util.Scanner;

public class JoystickTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Joystick joy = new Joystick();
		
		boolean sai = false;
		
		while(!sai) {
			System.out.println ("Aperte um botão ou digite 'sair' para sair");
			String option = input.next();
			
			if(!(option.equalsIgnoreCase("sair"))) {
				Button button = joy.getButton(option);
				button.pressButton();
			} else {
				System.out.println("Saindo...");
				sai = true;
			}
		}
	}
}
