package exs_estrutura_sequencial;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.141598
		
		Scanner sc = new Scanner(System.in);
		double pi = 3.141598;
		double raio = sc.nextDouble();
		double area = pi * (raio = Math.pow(raio,2.0));
		
		System.out.printf("A = %.4f" , area);
		sc.close();
	}

}