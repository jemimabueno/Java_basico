package comandos_basicos;

public class Main {

	public static void main(String[] args) {
		//escrever o conteúdo de uma variável de algum tipo básico
		int y=32;
		System.out.println(y);
		
		//escrever o conteúdo de uma variável com ponto flutuante
		double x=10.35784;
		System.out.println(x);
		
		//formatar para 2 casas decimais
		System.out.printf("%.2f%n",x);
		
		//concatenar vários elementos em um mesmo comando de escrita
		System.out.println("Resultado = " + x + " METROS");
		
		//concatenar vários elementos em um mesmo comando de escrita
		//%f = ponto flutuante
		//%n = quebra de linha
		System.out.printf("Resultado = %.2f metros%n",x);
		
		//concatenar vários elementos em um mesmo comando de escrita
		// %f = ponto flutuante; %d = inteiro; %s=texto; %n= quebra de linha
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		
	}

}
