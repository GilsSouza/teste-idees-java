package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		
		int a, b;	
				
		System.out.println("Digite o primeiro valor: ");
		a = Scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = Scan.nextInt();
		
		int soma = soma (a,b);
		int subtracao = subtracao(a,b);
		double divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("O resultado da soma é: "+(soma));
		System.out.println("O resultado da subtração é: "+(subtracao));
		System.out.println("O resultado da divisão é: "+(divisao));
		System.out.println("O resultado da multiplicação é: "+(multiplicacao));

	}
	
	public static int soma (int a, int b) {
		return a + b;	
		
	}
	public static int subtracao (int a, int b) {
		return a - b;	
		
	}
	public static double divisao (double a, double b) {
		return a / b;	
		
	}
	public static int multiplicacao (int a, int b) {
		return a * b;	
		
	}
}
