package exs_estrutura_sequencial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Exercício 1
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int total = x + y;
		
		System.out.println("SOMA = "+ total);
		
		sc.close();
		
	}
	}
