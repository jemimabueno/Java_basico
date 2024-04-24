import java.util.Scanner;
public class ex_for_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ler um número inteiro N e calcular todos os seus divisores.
		 
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			if(n%i ==0) { // aqui usamos o simoblo % para módulo, ou seja, resto da divisão, ele va dividir n por i(que começou com 1) e ver se é divisivel, e anotar esse numero no console se sim
				System.out.println(i);
			}
			
		}
		sc.close();
	}

}
