package application;
import java.util.Scanner;
import entities.Triangle;
public class Program {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 
		 
		 //double xA, xB, xC, yA, yB, yC; apagar e chamar a classe
		 
		 Triangle x,y; //chamando a classe triangle e atribuindo x e y 
		 
		 x = new Triangle();
		 y= new Triangle();
		 
		 System.out.println("Enter the measures of triangle X: ");
		 x.a= sc.nextDouble();
		 x.b= sc.nextDouble();
		 x.c= sc.nextDouble();
		 System.out.println("Enter the measures of triangle Y: ");
		 y.a= sc.nextDouble();
		 y.b= sc.nextDouble();
		 y.c= sc.nextDouble();
		 
		 double p= (x.a+ x.b+ x.c) / 2.0;
		 double areaX = x.area();
		 
		 p= (y.a+ y.b+ y.c) / 2.0;
		 double areaY=y.area();
		 System.out.printf("Triangle X area: %.4f%n", areaX);
		 System.out.printf("Triangle Y area: %.4f%n", areaY);
		 if(areaX> areaY) {
		 System.out.println("Largerarea: X");
		 }
		 else{
		 System.out.println("Largerarea: Y");
		 }
		 sc.close();

	}

}
