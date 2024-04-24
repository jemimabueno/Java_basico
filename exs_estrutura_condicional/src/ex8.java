package exs_estrutura_condicional;
import java.util.Scanner;
public class ex8 {

	public static void main(String[] args) {
		/* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
		qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
	        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo. */
		
		Scanner sc = new Scanner(System.in);
		double salario,imposto;
		salario = sc.nextDouble();
		
		if(salario <2000.00) {
			imposto = 0.0;
		}
		else if ( salario <= 3000.00) {
			imposto = (salario-2000.00) * 0.08;
		}
		else if (salario <= 4500.00) {
			imposto = (salario-3000.00) * 0.18 + 1000.00 * 0.08;
		}
		else {
			imposto = (salario - 4500.0)*0.28 +1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if ( imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f", imposto);
			
		}
		sc.close();
	}

}
