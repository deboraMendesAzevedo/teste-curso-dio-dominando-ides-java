package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		int a, b;
		System.out.println("Digite o primeiro valor : ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor : ");
		b = scan.nextInt(); 
		
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("Os números escolhidos são " + a +" e " + b);
		System.out.println("Soma é igual " + soma);
		System.out.println("Subtração é igual " + subtracao);
		System.out.println("Multiplicação é igual " + multiplicacao);
		System.out.println("Divisão é igual " + divisao);
		
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao (int a, int b) {
		return a - b;
	}

	public static float divisao(float a, float b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
}
