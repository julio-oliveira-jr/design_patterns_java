package com.julio.strategy;

public class Calculadora {
	public OperacaoMatematica operacao;
	
	public double realizaroperacao(double num1, double num2) {
		return operacao.realizaroperacao(num1, num2);
	}
}
