package Arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantidade de alunos: ");
		int qtdAlunos = entrada.nextInt();
		System.out.println("Digite quantidade de notas: ");
		int qtdNotas = entrada.nextInt();
		
		double notaSala[][] = new double[qtdAlunos][qtdNotas];
		
		
		double total = 0;
		for (int a = 0; a < notaSala.length; a++) {
			for (int n = 0; n < notaSala[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notaSala[a][n] = entrada.nextDouble();
				total += notaSala[a][n];
				
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média da turma: " + media);
		
		
		entrada.close();
	}
}
