package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	
	
	System.out.println("Quantas notas você deseja inserir?");
	int qtdNotas = entrada.nextInt();
	
	double notas[] = new double[qtdNotas];
	
	for (int i = 0; i < notas.length; i++) {
		System.out.println("Digite sua nota " + (i + 1) + "º:");
		notas[i] = entrada.nextDouble();
	}
	
	double total = 0;
	for (double nota : notas) {
		total += nota;
	}
	
	System.out.println("Sua média é: " + (total / notas.length));
	
	entrada.close();
	}
}
