package exs_estrutura_condicional;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		
		/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		
		Scanner sc = new Scanner(System.in);
		double horaInicial, horaFinal;
		
		horaInicial= sc.nextDouble();
		horaFinal = sc.nextDouble();
		double duracao;
		if(horaFinal < horaInicial)
		{
			duracao = horaFinal - horaInicial;
			
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("O jogo durou " + duracao + "hora(s)");
		sc.close();
	}

}
