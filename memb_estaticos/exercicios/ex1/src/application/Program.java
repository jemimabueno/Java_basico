package application;
import java.util.Scanner;
import util.CurrencyConverter;
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollar will be bought?");
		double amount = sc.nextDouble();
		double total = CurrencyConverter.conv(amount, dollarPrice);
		
		System.out.println("Amount to be paid in reais:"  + total);
	}

}
