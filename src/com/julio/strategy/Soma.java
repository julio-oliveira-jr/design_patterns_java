package com.julio.strategy;

public class Soma implements OperacaoMatematica {

	@Override
	public double realizaroperacao(double num1, double num2) {
		return num1 + num2;
	}

}
