package application;
import java.util.Scanner;
import entities.Employee;


public class Program {

	public static void main(String[] args) {
		
		/*  Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
			seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
			salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
			afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
			projetada abaixo.*/
		
		 Scanner sc = new Scanner(System.in);		
		 Employee emp = new Employee();
		
		
		emp.name = sc.nextLine();
		emp.GrossSalary = sc.nextDouble();
		emp.tax  = sc.nextDouble();
			
		System.out.println("Employee: " + emp.name + "," + "$ " + emp.NetSalary());
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data " + emp);
			
		sc.close();
		
	}

}
