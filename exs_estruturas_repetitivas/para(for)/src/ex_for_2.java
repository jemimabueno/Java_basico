import java.util.Scanner;
public class ex_for_2 {

	public static void main(String[] args) {
		// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
		//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt(); 	// numero inserido pelo usuário(quantidade que o sistema vai ler após isso)
		
		int in = 0; // iniciando a variavel 'in' que será utilizada no final, como pedido pelo exercício
		int out = 0; // o mesmo, agora com 'out'
		
		for(int i=0;i<n;i++) 
		{
			int x = sc.nextInt(); // agora insira os numeros de acordo com a quantidade inserida em 'N'. Ex: inseri numero 5, agr insira 5 numeros
			if(x >= 10 && x <= 20) { //irá analisar, se estiver entre 10 e 20 adiione 1 ao 'in' se não, ao 'out'.
				in = in +1;
			}
			else {
				out =out +1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
