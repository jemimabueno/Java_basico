package exs_estrutura_sequencial;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Scanner sc = new Scanner(System.in);
		
		int pc1 =  sc.nextInt();
		int n_pc1 = sc.nextInt();
		double vlr1 = sc.nextDouble();
		int pc2 =  sc.nextInt();
		int n_pc2 = sc.nextInt();
		double vlr2 = sc.nextDouble();
		
		double total = n_pc1*vlr1 + n_pc2*vlr2;
		
		System.out.printf("Valor a pagar: R$ %.2f", total);
		sc.close();
	}

}
