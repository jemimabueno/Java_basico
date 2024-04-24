import java.util.Scanner;
public class ex_for_4 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
						
			if(b == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				double divisao = (double) (a/b);
				System.out.println(divisao);
			}
			
			
		}
	}

}  