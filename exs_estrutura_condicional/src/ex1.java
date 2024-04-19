package exs_estrutura_condicional;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número:");
		
		double numero = sc.nextDouble();
		if(numero > 0) {
			System.out.println("Número POSITIVO");
		}else {
			System.out.println("Número NEGATIVO");
		}
				
		sc.close();
	}

}
