package com.julio.strategy;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean sai = false;
		
		while(!sai) {
			System.out.println("Digite a operação desejada: (1) soma, (2) subtracao, (3) multiplicacao, (4) divisao ou (5) para sair");
			int opcao = Integer.parseInt(input.next());
			
			if(opcao != 5) {
				TipoOperacao tipoOperacao = TipoOperacao.values()[opcao -1];
				
				System.out.println("Digite os números que deseja realizar a operação:");
				double num1 = Double.parseDouble(input.next());
				double num2 = Double.parseDouble(input.next());
		
				Calculadora calculadora = new Calculadora();
		
				OperacaoMatematica operacao = tipoOperacao.realizaroperacao();
				calculadora.operacao = operacao;
		
				double resultado = calculadora.operacao.realizaroperacao(num1, num2);
		
				System.out.println("O resultado da operacao e: " + resultado);
				
			} else {
				sai = true;
				System.out.println("Saindo...");
			}
		}
	}
}
