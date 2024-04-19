package exs_estrutura_sequencial;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
		
		Scanner sc = new Scanner(System.in);
		int n_func = sc.nextInt();
		double hr_trb = sc.nextDouble();
		double valor_hora = sc.nextDouble();
		double SALARIO;
		
		SALARIO = valor_hora * hr_trb;
		
		System.out.printf("Número: %d %nSalário: U$ %.2f", n_func, SALARIO);
		
		sc.close();
		
	}

}
