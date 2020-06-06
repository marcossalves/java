package exercicios;

import java.util.Scanner;

public class jokenPow {
	
	public static void main(String[] args) {
		
	// criação variavel inteiro sorteio 
	int sorteio, pedra, papel,tesoura;
	

	// (int) converte o resultado em um valor inteiro e Math.random gera um valor aleatorio até 3 ()
	sorteio = (int) (Math.random() * 3 + 1);
	System.out.println("valor sorteio= " + sorteio);
	
	//A pedra quebra a tesoura.
	//A tesoura corta o papel.
	//O papel embrulha a pedra.

	//leitura
	Scanner ler = new Scanner(System.in);
	String  n;
	
	System.out.printf("Informe pedra, papel ou tesoura: ");
	n = ler.nextLine();

	
pedra   = 1;
papel   = 2;
tesoura = 3;

 
if (pedra >= sorteio) {System.out.println("Empate Player 1 pedra e Player 2 pedra") ;

}

else if (papel == sorteio) {System.out.println("Empate Player 1 papel e Player 2 papel");}


	else if (tesoura == sorteio) {System.out.println("Empate Player 1 Tesoura e Player 2 Tesoura");}


	}
}

