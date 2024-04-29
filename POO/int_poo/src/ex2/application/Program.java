package application;
import java.util.Scanner;
import entities.Product;


public class Program {

	public static void main(String[] args) {
		
		/* Mostrarosdadosdoproduto(nome,preço,quantidadenoestoque,valortotalno
		 estoque)
	     •Realizarumaentradanoestoqueemostrarnovamenteosdadosdoproduto
	     •Realizarumasaídanoestoqueemostrarnovamenteosdadosdoproduto     */
		
		Scanner sc= new Scanner(System.in);
		Product pdt = new Product();
		
		System.out.println("Enter product data:");
		
		pdt.name = sc.next();
		pdt.price = sc.nextDouble();
		pdt.quantity  = sc.nextInt();
		
		System.out.println("Product data:" + pdt.name  +  ", " + " $"+ pdt.price + ", " + pdt.quantity + " units, " + "Total: $" + pdt.TotalValueInStock());

		System.out.println("Enter the number of products to be added in stock:");
		int quantity = sc.nextInt();
		pdt.AddProducts(quantity);
		
		System.out.println("Updated data:" + pdt.name + "," + pdt.price + ", " + pdt.quantity + " units, " + "Total: $ " + pdt.TotalValueInStock());
		System.out.println("Enter the number of products to be removed from stock:");
		
		quantity = sc.nextInt();
		pdt.RemoveProducts(quantity);
		System.out.println("Updated data:" + pdt.name + "," + pdt.price + ", " + pdt.quantity + " units, " + "Total: $ " + pdt.TotalValueInStock());
		sc.close();
	}

}
