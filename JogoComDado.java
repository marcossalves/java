/**
 * @author Marcos Severino Alves
 * Jogando Dados com o computador
*/

package exercicios;

import java.util.Scanner;

public class JogoComDado {

	public static void main(String[] args) {
		// Variáveis

		int jogador, computador;
		
		

		// Entrada
		Scanner leitor = new java.util.Scanner(System.in);
		System.out.println(" Jogando Dados com o computador");
		System.out.println("");
		System.out.println("");
		System.out.println(" Digite seu nome para jogar =");
		String n = leitor.nextLine();
		leitor.close();
		
		
		// Resultados aleatórios Dado1 e Dado2
		jogador = (int) (Math.random() * 6) + 1;
		System.out.println(" Resultado  " + n + " = " + jogador);

		computador = (int) (Math.random() * 6) + 1;
		System.out.println(" Resultado  computador " + "= "+ computador);

		// processamento

		if (jogador > computador) {
			System.out.println(  n + " venceu ");
		}

	
		if (jogador == computador) {
			System.out.println(" Empate");
		}
		
		if (computador > jogador) {
			System.out.println(" computador venceu");

	
}

	}

}

